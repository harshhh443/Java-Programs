//Create a class representing a Line with properties representing two points and methods to calculate length and slope.
class Line{
    int a,b,x,y;
    Line(int a,int b,int x,int y){
        this.a=a;
        this.b=b;
        this.x=x;
        this.y=y;
    }
    void calcLength(){
        System.out.println("The length between ("+a+","+b+") and ("+x+","+y+") is : "+Math.sqrt((x-a)*(x-a)+(y-b)*(y-b)));
    }
    void calcSlope(){
        System.out.println("The scope of ("+a+","+b+") and ("+x+","+y+") is : "+(y-b)/(x-a));
    }
}
public class LineWithPropertiesClass {
    public static void main(String[] args) {
        Line l1=new Line(3,3,8,2);
        l1.calcLength();
        l1.calcSlope();
    }
}
