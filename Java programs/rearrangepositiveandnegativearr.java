//Rearrange positive and negative numbers in an array.

import java.util.*;
public class rearrangepositiveandnegativearr{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int length = scan.nextInt();
        int arr[]= new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter the "+i+"th element : ");
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        

        scan.close();
    }

}