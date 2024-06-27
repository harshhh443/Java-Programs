//Find the kth smallest/largest element in an array.
import java.util.*;
public class findkthelementarr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int length=scan.nextInt();
        int arr[]=new int[length];
        //int arr[]={1,4,5,2,3};
        for(int i=0;i<length;i++){
            System.out.print("Enter the "+i+"th element in array : ");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the kth largest/smallest element to find :");
        int k=scan.nextInt();
        boolean loop=false;
        System.out.println("press 1 for finding largest :");
        System.out.println("press 2 for finding smallest :");
        do{
            
            int choice=scan.nextInt();

            if(choice==1){
                System.out.println(arr[arr.length-k]+" is the largest "+k+"th element in array.");
            }else if(choice==2){
                System.out.println(arr[k-1]+" is the smallest "+k+"th element in array.");
            }else{
                System.out.print("Invalid choice,press 1 or 2 :");
                loop=true;
            }
        
        }while(loop==true);

        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }

        scan.close();
    }
}
