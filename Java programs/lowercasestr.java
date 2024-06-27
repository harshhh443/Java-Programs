//Convert a string to lowercase.

import java.util.*;
public class lowercasestr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string :");
        String str = scan.nextLine();
        str = str.toLowerCase();

        System.out.println("String after lowercase:");
        System.out.println(str);
        scan.close();
    }
}
