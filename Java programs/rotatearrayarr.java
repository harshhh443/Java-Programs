//Rotate an array to the right by k steps.

import java.util.*;
public class rotatearrayarr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int length = scan.nextInt();
        int arr[]= new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter the "+i+"th element : ");
            arr[i] = scan.nextInt();

        }
        System.out.print("Enter the number of steps to shift the array right :");
        int steps =scan.nextInt();
        int arr2[] = new int[length];
        for(int i=0;i<length-steps;i++){
            arr2[i]=arr[i+steps];
        }
        int j=0;
        for(int i=length-steps;i<length;i++){
            arr2[i]=arr[j];
            j++;
        }
        
        for(int i=0;i<length;i++){
            System.out.print(arr2[i]+" ");
        }        
        scan.close();
    }
}
