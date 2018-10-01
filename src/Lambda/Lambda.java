package Lambda;

public class Lambda {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Bye";
        Operationable operation = (x, y) -> x / y;

        System.out.println(operation.calculate(10,9));
    }
}
interface Operationable {
        int calculate(int a, int b);
}

