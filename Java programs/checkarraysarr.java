//Check if two arrays are equal.
import java.util.*;
public class checkarraysarr{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of first array : ");
        int l1=scan.nextInt();
        int arr1[]=new int[l1];
        for(int i=0;i<l1;i++){
            System.out.print("Enter the "+(i+1)+"th element of array : ");
            arr1[i]=scan.nextInt();
        }
        System.out.print("Enter the length of Second array : ");
        int l2=scan.nextInt();
        int arr2[]=new int[l2];
        for(int i=0;i<l2;i++){
            System.out.print("Enter the "+(i+1)+"th element of array : ");
            arr2[i]=scan.nextInt();
        }
        Arrays.sort(arr1);Arrays.sort(arr2);
        for(int i=0;i<l1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<l2;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");
        boolean check=true;
        for(int i=0;i<Math.max(l2, l1);i++){
            if(arr1[i]==arr2[i]){
                check=true;
            }else{
                check=false;
                break;
            }
        }
        if(check==true){
            System.out.println("The arrays are equal.");
        }else{
            System.out.println("The arrays are not equal.");
        }
        scan.close();
    }
}