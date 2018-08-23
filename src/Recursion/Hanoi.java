package Recursion;

import java.util.Stack;

public class Hanoi {
    public static void main(String[] args) {
        Stack<Integer> from = new Stack<>();//первое кольцо
        Stack<Integer> help = new Stack<>();//второе кольцо
        Stack<Integer> to = new Stack<>();//третье кольцо

        from.push(3);
        from.push(2);
        from.push(1);
        System.out.println("start `from` : " + from);
        exchange(from,help,to,from.size());
        System.out.println("end `from` : " + from);
        System.out.println("end `to` : " + to);
//        System.out.println(help);
    }
    public static void exchange(Stack<Integer> from, Stack<Integer> help,
                                Stack<Integer> to, int count) {
        if(count > 0) {
            System.out.println("from : " + from + " help : " + help + " to : " + to);
            exchange(from,to,help,--count);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help,from,to, count);
        }

    }
}
