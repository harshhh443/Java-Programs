//Merge two sorted arrays into a single sorted array.
import java.util.*;
public class mergearraysarr {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the length of the first array : ");
        int length1 =scan.nextInt();
        int arr1[]=new int[length1];
        for(int i=0;i<length1;i++){
            System.out.print("Enter the "+(i+1)+"th element of the arrray : ");
            arr1[i]=scan.nextInt();
        }
        System.out.print("Enter the length of the Second array : ");
        int length2 =scan.nextInt();
        int arr2[]=new int[length2];
        for(int i=0;i<length2;i++){
            System.out.print("Enter the "+(i+1)+"th element of the arrray : ");
            arr2[i]=scan.nextInt();
        }
        int arr3[]=new int[length1+length2];
        for(int i=0;i<length1;i++){
            arr3[i]=arr1[i];
        }
        int j=0;
        for(int i=length1;i<length2+length1;i++){
            arr3[i]=arr2[j];
            j++;
        }
        Arrays.sort(arr3);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        scan.close();
    }
}
