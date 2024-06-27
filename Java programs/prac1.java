//Calculate the factorial of a number using a loop.

import java.util.*;
public class prac1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num =  scan.nextInt();
        int fac = 1 ;
        for( int i = 1 ;i<=num;i++){
            fac *= i;
        }
        System.out.println("The Factorial of "+num+" is "+fac);
        scan.close();
    }
}
