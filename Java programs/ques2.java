import java.util.Arrays;
public class ques2 {
    public static void main(String[] args) {
        int [] num={-4,-1,0,3,10};
        for(int i=0;i<num.length;i++){
            if(i==0){
                continue;
            }else{
            num[i]=num[i*i];
            }
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }    
}
    

