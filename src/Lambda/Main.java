package Lambda;
import static java.lang.Math.*;
import static java.lang.String.join;

public class  Main {
    public static void main(String[] args) {
        double a = sin(93.2);
        System.out.println(a);
        int n = 123456789;
        float f = n;
        String s = "SSSSS";
        s = s.substring(0,2) + "f" + s.substring(3,s.length());
        System.out.println(s);

        System.out.println(floorMod(34,4));
        float g =  9.49999f;
        int gint = round(g);
        System.out.println(gint);
        System.out.println(Size.LARGE.toString());
        System.out.println(s.substring(0, 3).equals("SSf") + "; code point: " + s.codePointAt(1));
        String c = "Scarlet Johansson            ";
        System.out.println(c.trim().endsWith("on"));
        StringBuilder stringBuilder = new StringBuilder("ffffff");
        stringBuilder.appendCodePoint(58110);
        System.out.println(stringBuilder.toString());
    }
}

class Calculate {
    int getMax(int a, int b) {
       return a > b? a : b;
    }
    int getMin(int a, int b) {
       return a < b? a : b;
    }
    Size s = Size.MEDIUM;

}
enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE}
