import java.util.*;
import java.io.*;
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int l =15 - s1.length();
            System.out.printf("%s%s%03d\n", s1, " ".repeat(l), x);
        }
        System.out.println("================================");

    }
}