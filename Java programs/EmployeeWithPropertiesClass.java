//Create a class representing a Employee with properties like name, employee ID, and methods to display information.
class Employee{
    String name;
    int empID;
    Employee(String name,int empID){
        this.empID=empID;
        this.name=name;
    }
    void display(){
        System.out.println("Name : "+name+" and Employee ID : "+empID);
    }
}
public class EmployeeWithPropertiesClass {
    public static void main(String[] args) {
        Employee e1=new Employee("Harsh",123);
        e1.display();
    }
}
