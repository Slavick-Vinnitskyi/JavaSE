package Super_This;

class A{
    A(){
        System.out.println("Конструктор класса А без аргументов");
    }
    A(int number){

        System.out.println("Конструктор Super_This.A с числом " + number);
    }
    int ret(){
        return 5;
    }
}
