package Static;

public class Car {
    private double speed;
    public static void  kmToMiles(int km){
        System.out.println("Внутри родительского класса/статического метода");
    }
}
class Audi extends Car {
    public static void  kmToMiles(int km){
        System.out.println("Внутри дочернего класса/статического метода ");
    }
}
class Demo {
    public static void main(String[] args) {
        Car r8 = new Audi();
        r8.kmToMiles(10);
    }
}
