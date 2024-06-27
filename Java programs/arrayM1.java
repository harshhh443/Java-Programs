//Find and print the second largest element in an array.

import java.util.*;
public class arrayM1 {
    public static void main(String[]args){
        int[] arr = {1,4,2,6,3};
        Arrays.sort(arr);
        int sec_lar_num = arr[arr.length-2];
        System.out.println(sec_lar_num);

    }
}