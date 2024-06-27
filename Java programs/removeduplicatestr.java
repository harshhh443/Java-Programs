//Remove duplicates from a string.

import java.util.*;
public class removeduplicatestr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string :");
        String str = scan.nextLine();
        String str2 ="";
        char ch1;
        char ch2;

        for(int i=0;i<str.length();i++){
            ch1=str.charAt(i);
            str2=str2+ch1;
            for(int j=1;j<str.length();j++){
                ch2=str.charAt(j);
                if(ch1!=ch2){
                    str2 =str.substring(0, j) + str.substring(j + 1); 
                    
                }

            }

        }
        System.out.println("String after removing duplicates.");
        System.out.println(str2);


        scan.close();
    }
}
