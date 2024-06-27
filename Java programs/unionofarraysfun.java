//Write a function to find the union of two arrays.
import java.util.*;
public class unionofarraysfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of first array : ");
        int l1=scan.nextInt();
        int arr1[]=new int[l1];
        for(int i=0;i<l1;i++){
            System.out.print("Enter the "+(i+1)+"th element : ");
            arr1[i]=scan.nextInt();
        }
        System.out.print("Enter the length of second array : ");
        int l2=scan.nextInt();
        int arr2[]=new int[l2];
        for(int i=0;i<l2;i++){
            System.out.print("Enter the "+(i+1)+"th element : ");
            arr2[i]=scan.nextInt();
        }
        unionarray(arr1,arr2);
        scan.close();
    }
    public static void unionarray(int a[],int b[]){
        int l3=a.length+b.length;
        int arr3[]=new int[l3];
        for(int i=0;i<a.length;i++){
            arr3[i]=a[i];
        }
        int k=0;
        for(int j=a.length;j<l3;j++){
            arr3[j]=b[k];
            k++;
        }
        Arrays.sort(arr3);
        for(int i=0;i<l3;i++){
            System.out.print(arr3[i]+" ");
        }        
    }
}
