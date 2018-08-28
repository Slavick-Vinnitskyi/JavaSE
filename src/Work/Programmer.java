package Work;

import java.time.LocalDate;

public class Programmer extends Employee {
    /**
     * Main programming language
     */
    private String mainLang;

    /**
     * The main scope
     */
    private String[] scopes = {"Front-end", "Back-end", "Testing", ""};

    /**
     * Experience with main language/technology
     */
    private float mainExp;



    Programmer(String firstName, String secondName, LocalDate hireDate, float salaryBase, float loyalty) {
        super(firstName, secondName, hireDate, salaryBase, loyalty);
    }
}
