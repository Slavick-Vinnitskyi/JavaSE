package Recursion;

/**
 * Среднее значение последовательности
 */
public class MediumValue {
    public static void main(String[] args) {
        System.out.println(recursion(0,0));
    }

    private static float recursion(int sum,int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            recursion(sum + n,++count);
        }
        else if (sum > 0 && count > 0) {
            return (float) n / count;
        }
        return 0;
    }
}
