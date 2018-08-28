package Work;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Employee extends  Person{
      /**
     * salary = base + bonus
     */
    private float salaryBase;
    /**
     * bonus = loyalty/5 * experience
     */
    private float salaryBonus;
    /**
     * 0 - min loyalty
     * 10 - max loyalty
     */
    private float loyalty;

    /**
     * format yyyy-day-month
     */
    private LocalDate hireDate;

    /**
     * First name + Second name
     */
    private String name;

    private String firstName;

    private String secondName;


    Employee(String firstName, String secondName, LocalDate hireDate, float salaryBase, float loyalty) {

        super(firstName, secondName);
        this.firstName = firstName;
        this.secondName = secondName;
        setName();
        this.hireDate = hireDate;
        this.salaryBase = salaryBase;
        this.loyalty = loyalty;
        setSalaryBonus();

    }
    public float getSalaryBase() {
        return salaryBase;
    }

    public float getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus() {
        float loyalty = this.loyalty;
        float exp = Period.between(this.hireDate, LocalDate.now()).getYears();
        float bonus = 1;
        if(loyalty < 0) {
            bonus = 0.05f * loyalty;

        }
        else if(loyalty > 0) {
            bonus = 0.2f * loyalty;

        }
        this.salaryBonus = bonus + exp / 10;

    }

    public float getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(float loyalty) {
        this.loyalty = loyalty - 5;
    }


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = this.firstName + " " + this.secondName;
    }



    public String getSalary() {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(salaryBase * salaryBonus);
//       return salaryBase * salaryBonus;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary(float salary){
        salary = salary * 3;
    }

    @Override
    public String getDescriprion() {
        return "An employee " + name +
                " with salary " + getSalary() +
                " (base=" + salaryBase +
                ", bonus=" + salaryBonus +
                ", loyalty=" + loyalty +
                "), work from " + hireDate;
    }

    @Override
    public String toString() {
        return "An employee " + name +
                " with salary " + getSalary() +
                " (base=" + salaryBase +
                ", bonus=" + salaryBonus +
                ", loyalty=" + loyalty +
                "), work from " + hireDate;
    }
    public static void main(String[] args) {

        Person[] people = new Person[4];
        people[0] = new Student("Slavick","Vinnitskyi", "Computer Science");
        people[1] = new Employee("Julia","Kotiaj", LocalDate.of(2018,2,3),300000,7);
        people[2] = new Employee("Pasha","Solyanikov", LocalDate.of(2018,2,2),300000,6);
        people[3] = new Programmer("Kostya","Kostukevich", LocalDate.of(2017,1,2),250000,2);
        for(Person p : people){
            System.out.println(p.getDescriprion());
            System.out.println(p.hashCode());
        }
        System.out.println(people[2].equals(people[1]));
    }
}

