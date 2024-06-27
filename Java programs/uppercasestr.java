//Convert a string to uppercase.

import java.util.*;
public class uppercasestr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string :");
        String str = scan.nextLine();
        str = str.toUpperCase();

        System.out.println("String after Uppercase:");
        System.out.println(str);
        scan.close();
    }
}
