//Remove duplicates from a sorted array.
import java.util.*;
public class removeduplicateelementarr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter the length of array : ");
        //int length=scan.nextInt();
        //int arr[]= new int[length];
        int arr[]={1,1,2,3,4};
        int arr2[]=new int[arr.length];
        int length=arr.length;
        //for(int i=0;i<length;i++){
            //System.out.print("Enter the "+i+"th element in array : ");
            //arr[i]=scan.nextInt();
        //}
        Arrays.sort(arr);
        arr2[0]=arr[0];
        //for(int i=0;i<length;i++){
            //for(int j=0;j<length;j++){
                //if(arr2[i]!=arr[j]){
                    //arr2[i]=arr[i];
                //}
            //}
        //}
    
        int j = 0;
        for (int i = 0; i < length-1; i++){
             
            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1]){
                arr2[j++] = arr[i];
            }
        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
            arr2[j++] = arr[length - 1];
        }

        // Modify original array
        for (int i = 0; i < j; i++){
            arr[i] = arr2[i];
 
        }
    


        for(int i=0;i<length;i++){
            System.out.print(arr2[i]+" ");
        }
        
        scan.close();
    }
}