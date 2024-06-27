//Write a function to find the length of a string.
import java.util.*;
public class lengthofastringfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str=scan.nextLine();
        lengthstr( str);
        scan.close();
    }

    public static void lengthstr(String a){
        int length= a.length();

        System.out.println(length);
    }
}
