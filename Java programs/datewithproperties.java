//Create a class representing a Date with properties day, month, and year and methods to validate and display the date.
class Date{
    int day,month,year;
    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    void validate(){
        if(day<31 || day>0){
            if(month<13 || month>0){
                if(year>0){
                    System.out.println("The given date is Validated.");
                }else{
                    System.out.println("The given date is Not Validated.");
                }
            }else{
                System.out.println("The given date is Not Validated.");
            }
        }else{
            System.out.println("The given date is Not Validated.");
        }
    }
    void display_date(){
        System.out.println("The Date is : "+day+"/"+month+"/"+year);
    }

}
public class datewithproperties {
    public static void main(String[] args) {
        Date d1=new Date(23,6,2024);
        d1.validate();
        d1.display_date();        
    }
}
