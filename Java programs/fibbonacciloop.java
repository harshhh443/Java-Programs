//Print the Fibonacci series up to a given number using a loop.
import java.util.Scanner;
public class fibbonacciloop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=scan.nextInt();
        int a=0,b=1;
        for(int i=1;i<=num;i++){
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        scan.close();
    }
}

