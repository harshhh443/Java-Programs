//Find the maximum sum subarray in an array.

public class maximumsumsubarrayarr {
    public static void main(String[] args) {
        int arr[]={6,-5,7,3,9};
        //int maxsum =0;
        int tempsum =0;

        for(int i=0;i<arr.length;i++){
            tempsum=tempsum+arr[i];
        }

        System.out.println(tempsum);
    }
}