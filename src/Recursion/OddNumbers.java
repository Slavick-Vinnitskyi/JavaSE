package Recursion;

/**
 * Вывести нечетные числа последовательности
 */
public class OddNumbers {
    public static void main(String[] args) {
        recursion();
    }
    private static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else {
                recursion();
            }
        }
    }
}
