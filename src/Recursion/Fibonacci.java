package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(Math.pow(1.68,10));
    }
    private static int  fib(int arg) {
        switch (arg){
            case 0:
                return 0;
            case  1:
                return 1;
                default: return fib(arg-1) + fib(arg-2);
        }
    }
}
