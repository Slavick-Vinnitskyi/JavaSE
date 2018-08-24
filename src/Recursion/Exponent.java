package Recursion;

public class Exponent {

    public static void main(String[] args) {
        int a = Exponent.ToPow(3, 3);
        System.out.println(a);
    }

    private static int ToPow(int num, int degree) {
        if (degree == 0) {
            return 1;
        } else {
            num *= ToPow(num, degree - 1);
        }
        return num;
    }
}
