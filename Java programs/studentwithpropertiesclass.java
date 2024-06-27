//Create a class representing a Student with properties like name, roll number, and methods to display information and calculate grades.
class Student{
    String name;
    int roll_no;
    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
    void display_info(){
        System.out.println("Name : "+name+" , Roll number : "+roll_no);
    }
    void calc_grades(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=85){
                System.out.print("A , ");
            }else if(arr[i]>=75){
                System.out.print("B , ");
            }else if(arr[i]>=65){
                System.out.print("C , ");
            }else{
                System.out.print("D , ");
            }
        }        
    }
}
public class studentwithpropertiesclass {
    public static void main(String[] args) {
        Student s1= new Student("Harsh",011);
        s1.display_info();
        int arr[]={88,87,76,30,75};
        s1.calc_grades(arr);        
    }
}
