//Reverse words in a string

import java.util.*;
class reversewordsstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = scan.nextLine();
        String temp ="";
        String str2 ="";
        char ch;
        char space=' ';
        int i=0;
        do{
            ch= str.charAt(i);
            if(ch!=' '){
                temp=ch+temp;
            }else{
                str2=str2+temp+space;
                temp="";

            }

            i++;
        }while(i<str.length());
        System.out.println("String after reversed words.");
        System.out.println(str2);

        scan.close();
    }
}