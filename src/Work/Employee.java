package Work;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
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
        System.out.println(exp);
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



    public float getSalary() {
       return salaryBase * salaryBonus;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    public void raiseSalary(float salary){
        salary = salary * 3;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salaryBase=" + salaryBase +
                ", salaryBonus=" + salaryBonus +
                ", salary=" + getSalary() +
                ", loyalty=" + loyalty +
                ", hireDate=" + hireDate +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.3;

        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
        Employee Jack = new Employee("Jack","Wilshere",LocalDate.of(2011,2,3),120000.00f,9);
        System.out.println(Jack.toString());
//        Jack.setSalaryBonus();


    }


}

