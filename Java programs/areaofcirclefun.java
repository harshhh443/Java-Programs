//Write a function to calculate the area of a circle given its radius.
import java.util.*;
public class areaofcirclefun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of a circle : ");
        float radius = scan.nextInt();
        areaofcircle(radius);
        scan.close();
    }

    public static void areaofcircle(float r){
        double area= (3.14)*(r*r);
        System.out.println(area+" is the area of the circle.");
    }
}
