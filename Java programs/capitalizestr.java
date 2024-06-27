//Capitalize the first letter of each word in a string.

import java.util.*;
public class capitalizestr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = scan.nextLine();
        String str2 ="";
        char ch;
        char ch2;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch!= ' '){
                String s1 = str.substring(0, 1).toUpperCase(); 
                String s2 = str.substring(1);  
                str2 = str.substring(0, 1).toUpperCase() + str.substring(1);
            }else{
                ch=str.charAt(i+1);
                
            }
        }
        System.out.println("String after Capitalised words.");
        System.out.println(str2);

        scan.close();
    }
}

