//Create a class representing a Bank 
//with properties like name, branch, and methods to add accounts, remove accounts, and display information.
class Bank{
    String Bname;
    int branch;
    Bank(String Bname,int branch){
        this.Bname=Bname;
        this.branch=branch;
    }
    void add(){
        System.out.println("Account added successfully.");
    }
    void remove(){
        System.out.println("Account removed successfully.");
    }
    void display(){
        System.out.println("Bank name : "+Bname+" ,Branch :"+branch);
    }
}
public class BankWithPropertiesclass {
    public static void main(String[] args) {
        Bank b1=new Bank("SBI",13);
        b1.add();
        b1.remove();
        b1.display();
    }
}
