package Work;

import java.time.LocalDate;

public class Programmer extends Employee {
    /**
     * Main programming language
     */
    private String mainLang;

    /**
     * Experience with main language/technology
     */
    private float mainExp;
    private Projects project;



    Programmer(String firstName, String secondName, LocalDate hireDate, float salaryBase, float loyalty) {
        super(firstName, secondName, hireDate, salaryBase, loyalty);

    }

}
enum Projects{BACKEND,FRONTEND,TESTING,FULLSTACK}
