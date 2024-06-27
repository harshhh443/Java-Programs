//Take a number as input and determine whether it's even or odd.

import java.util.*;
public class ifelseE2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scan.nextInt();
        if(num % 2==0){
            System.out.println("The number is an Even number");
        }else{
            System.out.println("The Number is an Odd Number");
        }
        scan.close();

    }
    
}
