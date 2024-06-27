//Create a class with multiple constructors, each initializing different sets of instance variables
class abc{
    int a,b,c;
    abc(int a){
        System.out.println("value of a is "+a);
    }

    abc(int a,int b){
        System.out.println("value of a and b is "+a +","+b);
    }

    abc(int a,int b,int c){
        System.out.println("value of a,b and c is "+a +","+b+ ","+c);
    }
}

public class constructorE3 {
    public static void main(String[] args) {
        abc obj1 =new abc(1);
        abc obj2 = new abc(2,3);
        abc obj3 = new abc(1,2,3);
    }
}
