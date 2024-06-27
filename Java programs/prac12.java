//Find the intersection of two arrays using a loop


import java.util.*;
public class prac12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the arrays :");
        int length = scan.nextInt();
        int arr1[]= new int[length];
        for(int i =0;i<length;i++){
            System.out.print("Enter the "+i+"th element of array1 :");
            arr1[i]= scan.nextInt();
        }

        int arr2[]= new int[length];
        for(int i =0;i<length;i++){
            System.out.print("Enter the "+i+"th element of array2 :");
            arr2[i]= scan.nextInt();
        }

        int arrayintsec[] = new int[length];

        for(int i=0;i<length;i++){
            for(int j=0;i<length;j++){
                if(arr1[i]!=arr2[j]){
                }else{
                    arrayintsec[i]=arr1[i];
                    break; 
                }
            }
        }
        
        for(int i=0;i<length;i++){
            System.out.print(arrayintsec[i]+" ");
        }
        
        scan.close();
    }
}
