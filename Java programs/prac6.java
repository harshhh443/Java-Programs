//Find the second largest element in an array using a loop.

import java.util.*;

public class prac6 {
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
        int sec_lar_num = arr[arr.length-2];
        System.out.println(sec_lar_num+" is the second largest number.");
        scan.close();
    }
}
