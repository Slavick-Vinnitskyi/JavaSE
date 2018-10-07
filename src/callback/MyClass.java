package callback;

public class MyClass implements SomeClass.Callback {
    @Override
    public void callingBack(String message) {
        if (message != null) {
            System.out.println("Your answer: " + message);

        } else {
            System.out.println("You have not answered the question!");
        }
    }
}
