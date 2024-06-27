//Write a function to find the greatest common divisor (GCD) of two numbers.
import java.util.*;
public class GCDoftwonumbersfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scan.nextInt();
        GDC(num1, num2);
        scan.close();
    
    }

    public static void GDC(int a,int b){
        int c=1,greater,smaller;
        
        if(a<b){
            greater=b;
            smaller=a;
        }else{
            greater=a;
            smaller=b;
        }

        for(int i=1;i<=smaller;i++){
            if(smaller%i==0 && greater%i==0){
                c=i;
            }
        }

        System.out.println(c+" is the GCD.");
    }
}
