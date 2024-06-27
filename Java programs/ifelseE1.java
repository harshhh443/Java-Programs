//Write a program that takes an integer as input and prints whether it's positive, negative, or zero.

import java.util.Scanner;
public class ifelseE1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scan.nextInt();
        if( num > 0){
            System.out.println("Number is Positive");
        }else if(num<0){
            System.out.println("Number is Negative");

        }else if(num==0){
            System.out.println("The number is zero");
        }else{
            System.out.println("Invalid Choice");
        }
        scan.close();


    }
    
}
