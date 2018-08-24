package Recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * Парсер мат выражений на рекурсии
 */
public class ExpressionParser {
    public static void main(String[] args) throws NumberFormatException {
        String expression = "2 + (3*1)";
        Map<String, Integer> brackets = numBrackets(expression);
        System.out.println(brackets.toString());
        if (brackets.get("leftBracket").equals(brackets.get("rightBracket")))
            System.out.println(ExpressionParser.eval(expression));
        else if (brackets.get("leftBracket") > (brackets.get("rightBracket")))
            System.out.println("'(' Must be closed!");
        else
            System.out.println("')' Must be opened!");

    }

    private static int eval(String exression) {

        exression = exression.replaceAll("\\s+","");
        if(exression.startsWith("(") && exression.endsWith(")")) {
            return eval(exression.substring(1,exression.length() - 1));
        }
        else if(exression.startsWith("(") && !exression.endsWith(")")) {
            throw new RuntimeException("Must ends with ')'");
        }
        else {
            int pos = 0;
            while (pos < exression.length() - 1) {
                if(Character.isDigit(exression.charAt(pos))){
                    pos++;
                }
                else {
                    int leftOperand = Integer.valueOf(exression.substring(0, pos));
                    char operation = exression.charAt(pos);
                    int rightOperand = eval(exression.substring(pos + 1));
                    switch (operation) {
                        case '+': return leftOperand + rightOperand;
                        case '-': return leftOperand - rightOperand;
                        case '*': return leftOperand * rightOperand;
                        case '/': return leftOperand / rightOperand;
                    }
                }
            }
        }
        return Integer.valueOf(exression);
    }

    private static Map<String, Integer> numBrackets(String expr) {
        Map<String, Integer> brackets = new HashMap <>();
        int rightBracketCount = 0, leftBracketCount = 0, i = 0;
        brackets.put("leftBracket", leftBracketCount);
        brackets.put("rightBracket", rightBracketCount);
        while (i < expr.length()) {
            switch (expr.charAt(i)) {
                case '(':
                    leftBracketCount++;
                    brackets.put("leftBracket", leftBracketCount);
                    break;
                case ')':
                    rightBracketCount++;
                    brackets.put("rightBracket", rightBracketCount);
                    break;
                default:
                    break;
            }
            i++;
        }
        return brackets;
    }
}
