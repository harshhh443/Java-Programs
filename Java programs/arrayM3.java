//Print only the unique elements from an array, removing duplicates

import java.util.*;
public class arrayM3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array :");
        int arrlen= scan.nextInt();
        int[] arr = new int[arrlen];

        Scanner scan2 = new Scanner(System.in);
        for(int i =0;i<arrlen;i++){
            System.out.print("Enter the "+i+"th element :");
            arr[i]= scan2.nextInt();
        }
        
        for(int i =0;i<arrlen;i++){
            for(int j =0;j<arrlen;j++){

            }
        }

        
        
        for(int i =0;i<arr.length;i++){
            System.out.print(" "+arr[i]);

        }
        scan.close();
        scan2.close();


        
    }
    
}
