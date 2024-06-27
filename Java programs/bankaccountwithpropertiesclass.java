//Create a class representing a BankAccount with properties like account number, balance,
// and methods to deposit, withdraw, and display balance.
class Bankaccount{
    int acc_no;
    int balance=0;
    Bankaccount(int acc_no){
        this.acc_no=acc_no;
    }
    void deposit(int D_money){
        balance=balance+D_money;
        System.out.println("RS."+D_money+" have been succesfully deposited to you account");
    }
    void withdraw(int W_money){
        balance=balance+W_money;
        System.out.println("RS."+W_money+" have been succesfully deposited to you account");
    }
    void display_bal(){
        System.out.println("Current Balance : "+balance);
    }
}
public class bankaccountwithpropertiesclass{
    public static void main(String[] args) {
        Bankaccount b1=new Bankaccount(1234);
        b1.deposit(2000);
        b1.withdraw(500);
        b1.display_bal();
    }
}