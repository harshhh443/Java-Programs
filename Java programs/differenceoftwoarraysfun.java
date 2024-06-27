//Write a function to find the difference of two arrays.
import java.util.*;
public class differenceoftwoarraysfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of first array : ");
        int l1=scan.nextInt();
        int arr1[]=new int[l1];
        for(int i=0;i<l1;i++){
            System.out.print("Enter the "+(i+1)+"th element : ");
            arr1[i]=scan.nextInt();
        }
        System.out.print("Enter the length of second array : ");
        int l2=scan.nextInt();
        int arr2[]=new int[l2];
        for(int i=0;i<l2;i++){
            System.out.print("Enter the "+(i+1)+"th element : ");
            arr2[i]=scan.nextInt();
        }
        difference_array(arr1,arr2);        
        scan.close();
    }
    public static void difference_array(int a[],int b[]){
        int[] arr3 = new int[Math.max(a.length, b.length)];
        int newlength=arr3.length;
        for(int i=0;i<Math.min(a.length, b.length);i++){
            arr3[i]=a[i]-b[i];
        }        
        Arrays.sort(arr3);
        for(int i=0;i<newlength;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
