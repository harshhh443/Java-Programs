//Create a class representing a Calculator with methods to perform basic arithmetic operations
// like addition, subtraction, multiplication, and division.

class Calculator {
    int addition(int a,int b){
        return a+b;
    }
    int subtraction(int a,int b){
        return a-b;
    }
    int multiplication(int a,int b){
        return a*b;
    }
    int division(int a,int b){
        return a/b;
    }
    
}
public class calculatorclass {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.addition(12,3));
        System.out.println(c1.subtraction(15,3));
        System.out.println(c1.multiplication(3,3));
        System.out.println(c1.division(9,3)); 
    }
}
