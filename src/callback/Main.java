package callback;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myClass = new MyClass();

        someClass.registerCallback(myClass);

        someClass.doSomething();
    }
}
