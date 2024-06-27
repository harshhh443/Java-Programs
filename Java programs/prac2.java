//Find the sum of digits of a number using a loop.

import java.util.*;
public class prac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to print its sum :");
        int number = scan.nextInt();
        int num = number;
        int res = 0;
        int m;
        while(num>0){  
            m=num%10;    
            res=res+m;    
            num=num/10;       
        }
        System.out.println("The sum of "+number+" is "+res);
        scan.close();
    }
}
