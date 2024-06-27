//Create a class representing a Triangle with properties representing three sides and methods to calculate area and perimeter.
class Triangle{
    int a,b,c;
    Triangle(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void area(int perpendicular){
        System.out.println("The area of the triangle is : "+0.5*c*perpendicular);
    }
    void perimeter(){
        System.out.println("The perimeter of the triangle is : "+(a+b+c));
    }
}
public class TriangleClass {
    public static void main(String[] args) {
        Triangle t1=new Triangle(3,5,4);
        t1.area(3);
        t1.perimeter();
    }
}
