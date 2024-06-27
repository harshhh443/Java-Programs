//Write a function to check if a number is prime.
import java.util.*;
public class checkprimefun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scan.nextInt();
        checkprime(num);
        if(checkprime(num)==true){
            System.out.println("The number is a prime number.");
        }else{
            System.out.println("The number is not a prime number.");
        }
        scan.close();

    }

    public static boolean checkprime(int a){
        int check=a;
        boolean flag = true;
        for(int i=2;i<check;i++){
            if(check%i==0){
                flag=false;
                break;
            }
        }

        return flag;

    }
    
}
