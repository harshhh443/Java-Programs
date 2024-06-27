//Check if a number is a prime number using a loop

import java.util.*;
public class prac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = scan.nextInt();
        int num= number;
        int check_prime = 0;
        for(int i =2; i<num;i++){
            if (num%i==0){
                check_prime=1;
                break;
            }else{
                check_prime = 0;
            }
        }
        if(check_prime == 1){
            System.out.println(number+" is not a prime number");
        }else{
            System.out.println(number+" is a prime number");
        }
        scan.close();
    }
    
}
