import java.util.Scanner;
public class loops {
    public static void main (String[]args){
        System.out.println("enter max value for i loop and j loop:");
        Scanner scan = new Scanner(System.in);
        int ival = scan.nextInt();
        int jval = scan.nextInt();

        for(int i=1;i<=ival;i++){
            System.out.println("value of i is"+ i);
            for(int j=1;j<=jval;j++){
                System.out.println("value of j is"+ j);
            }
        }
        scan.close();
    }
}
