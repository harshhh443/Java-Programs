//Write a program that checks if a given year is a leap year.

import java.util.*;
public class ifelseE3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to check :");
        int num = scan.nextInt();
        if(num%4==0){
            System.out.println("This year is a leap year");
        }else{
            System.out.println("This year is not a leap year");
        }
        scan.close();

    }
    
}
