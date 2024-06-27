//Check if an array is a palindrome.
public class palindromearr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        boolean check = false;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]==arr[arr.length-i-1]){
                check=true;
            }else{
                check=false;
                break;
            }
            
        }
        if(check==true){
            System.out.print("The array is a palindrome.");
        }else{
            System.out.print("The array is not a palindrome.");
        }
    }
}
