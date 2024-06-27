//Check if a string contains only digits.

import java.util.*;
public class checkonlydigitsstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string :");
        String str = scan.nextLine();
        int flag = 0;
        for(int i=0;i<str.length();i++){

            if (str.charAt(i) == '0' || str.charAt(i) == '1'|| str.charAt(i) == '2'|| str.charAt(i) == '3'
            || str.charAt(i) == '4'|| str.charAt(i) == '5' || str.charAt(i) == '6'|| str.charAt(i) == '7'
            || str.charAt(i) == '8'|| str.charAt(i) == '9') {
                System.out.println("This string does contain only digits.");

            }else{
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("This string does not only contain digits.");
        }
        scan.close();

    }
}
