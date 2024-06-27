//Given two numbers, print the larger one.

import java.util.*;
public class ifelseE4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
        scan.close();
        scan1.close();
    }
}
