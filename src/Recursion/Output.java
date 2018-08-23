package Recursion;

public class Output {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int i) {
        System.out.print(" " + i);

        if (i < 10) {
            f(i + 1);
        }

        System.out.print(" " + i);
    }
}