//Check if an array is sorted in ascending order using a loop.

import java.util.*;
public class prac8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array :");
        int length = scan.nextInt();
        int arr[]= new int[length];
        for(int i = 0 ;i<length;i++){
            System.out.print("Enter the "+i+"th element :");
            arr[i]= scan.nextInt();
        }
        int flag = 0;
        for(int i = 0 ;i<length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = 1;
                break;
            }
            
        }
        if(flag ==0){
            System.out.println("The array is sorted in ascending order.");
        }else{
            System.out.println("The array is not sorted in ascending order.");
        }

        scan.close();
        

    }
}
