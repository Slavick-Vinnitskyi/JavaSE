package Recursion;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Проверяет является ли число точной степенью двойки
 */
public class PowerTwo {
    public static void main(String[] args) {
        float n = 128;
        PrintWriter out = null;
        try {
            out = new PrintWriter("file.txt","UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }out.write("Result of recursion with  YES" );
        if (recursion(n) == 1) {


            System.out.println("YES");
        }
        else {
            out.println("Result of recursion with " + n + " : NO" );
            System.out.println("NO");
        }

    }
    public static float recursion(float number) {
        if(number == 1) {
            return 1;
        }
        else if(number > 1 && number < 2) {
            return 0;
        }
        else {
            return recursion(number/2);
        }

    }
}
