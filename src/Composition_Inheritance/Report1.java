package Composition_Inheritance;

public class Report1  implements  Report {
    DefaultHeader header;
    Body body;
    DefaultFooter footer;


    @Override
    public void print()  throws  NullPointerException{
        header.print();
        body.print();
        footer.print();
    }
}
