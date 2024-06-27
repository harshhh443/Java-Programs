//Write a function to calculate the sum of elements in an array.

import java.util.Scanner;

public class sumofelementinarrayfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length =scan.nextInt();
        int arr[]= new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter the "+(i+1)+"th element : ");
            arr[i]=scan.nextInt();
        }
        sumarray(arr);
        scan.close();
    }

    public static void sumarray(int a[]){
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }

        System.out.print("The sum of array is "+sum);
    }
}
