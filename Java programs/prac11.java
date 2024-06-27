//Count the occurrences of an element in an array using a loop.

import java.util.*;
public class prac11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array :");
        int length = scan.nextInt();
        int arr[]= new int[length];
        for(int i =0;i<length;i++){
            System.out.print("Enter the "+i+"th element :");
            arr[i]= scan.nextInt();
        }

        for(int i =0;i<length;i++){
            int count = 1;
            for(int j =i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            System.out.print(i+"th element which is "+arr[i]+" occured "+count+" times.");
            System.out.println("");
            
        }
        
        scan.close();
    }
        
}
