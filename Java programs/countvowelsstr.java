//Count the number of vowels in a string.

import java.util.*;
public class countvowelsstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string :");
        String str = scan.nextLine();
        str = str.toLowerCase();
        int count = 0;

        for(int i=0;i<str.length();i++){

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
                count+=1;
            }
        }

        System.out.println(count+" number of vowels are there in the string");
        
        scan.close();
    }
}
