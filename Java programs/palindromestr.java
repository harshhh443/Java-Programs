//Check if a string is a palindrome.

import java.util.*;
public class palindromestr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String to check :");
        String str = scan.nextLine();
        String revstr="";
        char ch ;

        for(int i =0;i<str.length();i++){
            ch = str.charAt(i);
            revstr= ch+revstr;
        }

        System.out.println(revstr);
        if(str.equals(revstr)){
            System.out.println("The given string is a palindrome.");
        }else{
            System.out.println("The given string is not a palindrome.");
        }


        scan.close();
    }
}
