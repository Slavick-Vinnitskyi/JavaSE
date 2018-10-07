package DDS.stack;
//Стэк работает по принципу FILO

public class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

