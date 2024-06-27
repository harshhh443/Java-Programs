import java.util.Arrays;
public class ques1 {
    //WAP to find the 2nd largest numbdr in array
    public static void main(String[] args) {

        int[] num = {2,3,53,23,56};
        Arrays.sort(num);
        int second_largest_num_index = num.length-1;
        System.out.println(num[second_largest_num_index]);
        }

    }

