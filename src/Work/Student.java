package Work;

public class Student extends Person {

    /**
     * предмет изучения
     */
    private String major;

    public Student(String firstName, String secondName, String major) {
        super(firstName, secondName);
        this.major = major;
    }

    @Override
    public String getDescriprion() {
        return "A student majoring in a " + major;
    }
}
