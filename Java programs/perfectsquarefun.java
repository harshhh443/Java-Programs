//Write a function to check if a given number is a perfect square.
import java.util.Scanner;
public class perfectsquarefun {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scan.nextInt();
        check_sq(num);
        scan.close();
    }
    public static void check_sq(int num){
        int flag=0;
        for(int i=0;i<(num/2);i++){
            if(Math.sqrt(num)==i){
                System.out.println(num+" is the perfect square,"+i+" square is equal to "+num+".");
                flag=1;
                break;
            }
        }
        if(flag!=1){
            System.out.println(num+" is not a perfect square.");
        }
    }
}