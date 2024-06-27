//Create a class representing a Circle with methods to calculate area and circumference.

import java.util.Scanner;

class circle{
    float r;
    circle(float r){
        System.out.println(3.14*r*r+" is the area of the cicle "+2*3.14*r+" is the circumference.");
    }
}
public class calcareaandcircumference {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Radius : ");
        float Radius=scan.nextFloat();
        circle c1=new circle(Radius);
        scan.close();
    }
}
