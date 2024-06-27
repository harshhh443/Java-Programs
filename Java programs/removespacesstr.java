//Remove spaces from a string.

import java.util.*;
public class removespacesstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = scan.nextLine();
        String str2 ="";
        char ch;

        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch!=' '){
                str2=str2+ch;
            }
        }
        System.out.println("String after removing spaces.");
        System.out.println(str2);
        scan.close();
    }
}
