//Reverse a string

import java.util.*;
public class revstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter something to Reverse :");
        String str = scan.nextLine();
        String revstr="";
        char ch;

        for (int i=0; i<str.length(); i++){
        ch= str.charAt(i);
        revstr= ch+revstr; //Pehle ch then revstr...taaki reverse hi add ho
      }

      System.out.println(revstr);

        scan.close();
    }
}
