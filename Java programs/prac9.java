//Reverse an array using a loop.

import java.util.*;
public class prac9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array :");
        int length = scan.nextInt();
        int arr[]= new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter the "+i+"th element :");
            arr[i]= scan.nextInt();
        }
        System.out.println("Orignal array");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Reversed array");
        
        for(int i=length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        scan.close();
    }
}
