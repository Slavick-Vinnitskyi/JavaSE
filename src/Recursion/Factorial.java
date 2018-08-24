package Recursion;

import java.util.Arrays;

/**
 * Найти факториал введенного числа
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
    private static int recursion(int n) {
        //Базовый случай
        if(n == 0 || n == 1){
            return 1;
        }
        //Шаг рекурсии
        return recursion(n - 1) * n;
    }
}
