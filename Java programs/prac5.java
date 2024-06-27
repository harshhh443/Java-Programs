//Find the largest element in an array using a loop.

import java.util.*;

public class prac5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of an array :");
        int length= scan.nextInt();
        int arr[]= new int[length];
        for(int i =0;i<length;i++){
            System.out.print("Enter the "+i+"th element :");
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        int lar_num = arr[arr.length-1];
        System.out.println(lar_num+" is the largest number.");
        scan.close();
    }
}
