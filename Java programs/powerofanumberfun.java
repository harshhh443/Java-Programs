//Write a function to calculate the power of a number.
import java.util.*;
public class powerofanumberfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter power : ");
        int num2 = scan.nextInt();
        power(num1, num2);
        scan.close();
    }

    public static void power(int a, int b){
        int res=a;
        for(int i=1;i<b;i++){
           res=res*a;
        }

        System.out.println(res);
    }
}
