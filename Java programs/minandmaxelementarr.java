//Find the minimum and maximum elements in an array.


public class minandmaxelementarr {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        int min=arr[0];
        int max =arr[0];
        
        for(int i=0;i<arr.length-1;i++){
            min=(min<arr[i+1]?min:arr[i+1]);
        }

        
        for(int i=0;i<arr.length-1;i++){
            max=(max>arr[i+1]?max:arr[i+1]);
        }
        System.out.println(min+" , "+max);
    }
}
