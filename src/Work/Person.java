package Work;

public abstract class Person {
    private String firstName;

    private String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public abstract String getDescriprion();

    public String getName() {
        return this.firstName + this.secondName;
    }
}
