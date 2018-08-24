package Recursion;

/**
 * Развернуть число рекурсивно
 */
public class ReverseNumber {
    public static void main(String[] args) {
        recursion(4345);
    }
    private static int recursion(int number) {
        if(number < 10) {
            System.out.print(" " + number);
            return 0;
        }
        System.out.print(" " + number % 10);
        return  recursion(number/10);
    }
}
