//Rotate the elements of an array to the right by one position.


public class arrayM2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        int[] arr2 = new int[arr.length];
        
        for(int i=0;i<arr.length-1;i++){
            arr2[i+1]=arr[i];
        }
        arr2[0]=arr[arr.length-1];

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
