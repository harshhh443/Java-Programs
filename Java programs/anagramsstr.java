//Check if two strings are anagrams.

import java.util.*;
public class anagramsstr{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string : ");
        String str2 = scan.nextLine();
        char ch1;
        char ch2;
        int flag = 0;
        for(int i=0;i<str1.length();i++){
            ch1= str1.charAt(i);
            for(int j=0;j<str2.length();j++){
                ch2= str2.charAt(j);
                if(ch1==ch2){
                    flag++;
                    break;
                }
            }

        }
        if(flag== str2.length()){
            System.out.println("The two strings are anagrams.");
        }else{
            System.out.println("The two strings are not anagrams.");
        }
        
        scan.close();
    }
}