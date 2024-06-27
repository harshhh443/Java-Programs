//Write a function that takes two parameters (numbers) and returns their sum.

import java.util.*;
public class functionsE1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+sum(a, b));
        scan.close();
    }

    public static int sum(int a , int b ){
        return a+b;
    }
}