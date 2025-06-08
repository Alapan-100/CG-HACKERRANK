import java.io.*;
import java.util.*;
public class JavaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int length = (A.length() + B.length());
        System.out.println(length);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String CapitalS1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String CaptialS2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(CapitalS1 + " " + CaptialS2);
    }
}



