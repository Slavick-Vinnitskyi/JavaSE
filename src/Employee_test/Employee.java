package Employee_test;

import java.time.LocalDate;

public class Employee {
    Employee(LocalDate hireDate, int salary, String name)
    {
        this.hireDate = hireDate;
        this.salary = salary;
        this.name = name;
        this.setId();
    }
    private int id;

    private static int nextId;

    private String name;

    private int salary;

    public LocalDate hireDate;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    @Override
    public String toString() {
        return name + " {" +
                "id = " + getId() +
                ", name='" + getName() + '\'' +
                ", salary = " + getSalary() +
                ", hireDate = " + getHireDate() +
                '}';
    }
}

