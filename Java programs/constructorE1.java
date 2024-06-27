//Create a class with a parameterized constructor that initializes an instance variable and print the value.
class area{
    String str = "Area class called";
       
    area(int length,int breadth){
        System.out.println("Parameterized constructor called");
        System.out.println(length*breadth);
        
    }
}

public  class constructorE1 {
    public static void main(String[] args) {
        area a1 = new area(4,4);
        System.out.println(a1.str);


    }
} 