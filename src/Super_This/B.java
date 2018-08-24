package Super_This;

class  B extends  A {
    B() {
//        this(5);
         System.out.println("Конструктор класса В");

    }
    B(int number){
        super(5);
        System.out.println("Конструктор Super_This.B с числом " + number);
    }
    @Override
    int ret(){
        return 6;
    }


}
