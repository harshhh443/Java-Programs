//Find the second largest/smallest element in an array.
import java.util.*;
public class secondlargestelementarr {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length =scan.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter the "+(i+1)+"th element of the arrray : ");
            arr[i]=scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[1]+" is the 2nd smallest number and "+arr[length-2]+" is the 2nd largest number.");
        scan.close();
    }
}
