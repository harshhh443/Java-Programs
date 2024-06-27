//Calculate the sum of all elements in an array using a loop.

import java.util.*;
public class prac7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of an array :");
        int length= scan.nextInt();
        int arr[]= new int[length];
        for(int i =0;i<length;i++){
            System.out.print("Enter the "+i+"th element :");
            arr[i]= scan.nextInt();
        }
        int res = 0;
        for(int i=0;i<length;i++){
            res = res + arr[i];
        }
        System.out.println("The sum of all elements is "+res);
        scan.close();
    }
}