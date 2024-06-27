//Create a class with a default constructor that initializes an instance variable to a default value and print it.


class MyClass {
    private static int defaultValue;
    public MyClass() {
        defaultValue = 42;
    }

    public void printDefaultValue() {
        System.out.println("Default Value: " + defaultValue);
    }
}
public class constructorE2 {
    public static void main(String[] args) {
        
        MyClass myObject = new MyClass();
        myObject.printDefaultValue();
    }

    
}
    
