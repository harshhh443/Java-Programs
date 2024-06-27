//Remove duplicates from an array using a loop.

import java.util.*;
public class prac10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array :");
        int length = scan.nextInt();
        int arr[]= new int[length];
        for(int i =0;i<length;i++){
            System.out.print("Enter the "+i+"th element :");
            arr[i]= scan.nextInt();
        }
        System.out.println("Orignal Array");
        for(int i =0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Array after removing duplicate element");
        int flag = 0;
        for(int i =0;i<length;i++){
            for(int j =i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    flag = 0;
                    break;
                }else{
                    flag = 1;
                }
            }
            if(flag==1){
                System.out.print(arr[i]+" ");
            }
        }
        scan.close();
    }
}
