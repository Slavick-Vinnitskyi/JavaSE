package DDS.stack;

public class Main {

    public static void main(String[] args) {
        Node tail = null;
//      Добавляем в порядке 0,1,2,3
        tail = new Node(0, tail);
        tail = new Node(1, tail);
        tail = new Node(2, tail);
        tail = new Node(3, tail);

        Node tmp = tail;
//      Получаем в порядку 3,2,1,0
        /*hile (tmp != null) {
            System.out.print(" " + tmp.value);
            tmp = tmp.next;
        }*/
        System.out.println(toString_(tmp));
    }

    private static String toString_(Node tail) {
        return tail == null ? "*" : tail.value + "->" + toString_(tail.next);
    }
}