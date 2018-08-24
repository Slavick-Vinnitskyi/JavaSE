package Recursion;


/**
 *  Количество элементов, равных максимуму
 */
public class MaxNumbers {
    public static void main(String[] args) {
        recursion();

    }

    private static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        int max = 1;
        // Базовый случай
        if (n > 0) {
            if (max < n) {
                System.out.println(n);
                recursion();
            } else {
                recursion();

            }
        }
    }
}
