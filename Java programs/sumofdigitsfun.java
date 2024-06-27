//Write a function to find the sum of digits of a number.
import java.util.*;

public class sumofdigitsfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scan.nextInt(); 
        System.out.println("The sum of "+num+" is "+digitssum(num));       
        scan.close();
    
    }

    public static int digitssum(int num){
        int number=num;
        int res=0;
        while(number>0){
            res=res+number%10;
            number=number/10;
        }
        
        return res;
    }
}
