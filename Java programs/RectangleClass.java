//Create a class representing a Rectangle with methods to check if it is a square and calculate diagonal length.
class Rectangle1{
    int a,b;
    Rectangle1(int a ,int b){
        this.a=a;
        this.b=b;
    }
    void checkSq(){
        if(a==b){
            System.out.println("It is a square.");
        }else{
            System.out.println("It is not a square.");
        }
    }
    void calcDiagnolLength(){
        System.out.println("The diagnol length is : "+Math.sqrt((a*a)+(b*b)));
    }
}
public class RectangleClass{
    public static void main(String[] args) {
        Rectangle1 r1= new Rectangle1(3, 4);
        r1.checkSq();
        r1.calcDiagnolLength();
    }
}