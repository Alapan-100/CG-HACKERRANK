import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toLowerCase().toCharArray();
        char[] b = sc.nextLine().toLowerCase().toCharArray();
        sc.close();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagrams" : "Not Anagrams");
    }
}
