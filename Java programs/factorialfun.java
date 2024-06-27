//Write a function to calculate the factorial of a number.
import java.util.*;
public class factorialfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scan.nextInt();
        System.out.println(fac(num));
        scan.close();
    }

    public static int fac(int a){
        int factorial = a;
        int res =1;
        for(int i=1;i<factorial;i++){
            res=res+(res*i);
        }
        return res;
    }
}
