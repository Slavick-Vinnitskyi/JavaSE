package Recursion;

/**
 * Дано натуральное число N. Вычислите сумму его цифр.
 */
public class SumOfDigitNumbers {
    public static void main(String[] args) {
        int number = 91823;
        System.out.println(recursion(number));
    }

    private static int recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            return recursion(n % 10) + recursion(n / 10);
        }
    }
}
