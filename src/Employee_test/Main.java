package Employee_test;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee James_Cornel = new Employee(LocalDate.of(2001,12,31),3000,"John Cornel");
        Employee Lisa_Joy = new Employee(LocalDate.now(),5000,"Lisa Joy");
        Employee Adam_Sendler = new Employee(LocalDate.now(),4000,"Adam Sendler");
        System.out.println(James_Cornel.toString());
        System.out.println(Lisa_Joy.toString());
        System.out.println(Adam_Sendler.toString());
    }
}
