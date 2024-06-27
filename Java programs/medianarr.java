//Find the median of an array.
import java.util.*;
public class medianarr {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int l1=scan.nextInt();
        int arr1[]=new int[l1];
        for(int i=0;i<l1;i++){
            System.out.print("Enter the "+(i+1)+"th element of array : ");
            arr1[i]=scan.nextInt();
        }
        Arrays.sort(arr1);
        for(int i=0;i<l1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        int median_term=0;
        if(l1%2==0){
            median_term= ((l1/2)+((l1+1)/2))/2;
        }else{
            median_term= (l1+1)/2;
        }
        System.out.println("The median of array is "+arr1[median_term-1]);
        scan.close();
    }
}
