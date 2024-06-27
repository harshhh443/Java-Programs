//Create a class representing a Point with properties x and y coordinates and methods to calculate distance from another point.
class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    void distance_from(int a,int b){
        System.out.println(Math.sqrt(((x-a)*(x-a))+((y-b)*(y-b)))+" cm");
    }
}
public class pointwithproperties {
    public static void main(String[] args) {
        Point p1=new Point(10,10);
        p1.distance_from(0,0);
    }
}
