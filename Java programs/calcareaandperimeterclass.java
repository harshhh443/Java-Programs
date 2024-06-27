//Create a class representing a Rectangle with methods to calculate area and perimeter.

import java.util.Scanner;

class Rectangle {
    int a,b;
    Rectangle(int a,int b){
        System.out.println("Perimeter is "+2*(a+b)+" and area is "+a*b);
    } 
}


public class calcareaandperimeterclass{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter length : ");
        int length=scan.nextInt();
        System.out.print("Enter breadth : ");
        int breadth =scan.nextInt();
        Rectangle r1=new Rectangle(length,breadth);
        scan.close();
    }
}