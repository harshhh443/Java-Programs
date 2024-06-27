//Write a function to convert temperature from Celsius to Fahrenheit.
import java.util.*;
public class converttempraturefun {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter temprature in Celsius : ");
        float a=scan.nextInt();
        convert_to_far(a);
        scan.close();
    }
    public static void convert_to_far(float a){
        //double b=(a*9)/5+32;
        float b =( (a*9)/5)+32;
        System.out.println(b);
    }
}
