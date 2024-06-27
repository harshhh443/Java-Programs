//Create a class representing a Car with properties like make, model, year, and methods to accelerate, brake, and display information.
class Car{
    String make,model;
    int year;
    Car(String make, String model, int year ){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void accelerate(int zero_to_100_inseconds){
        System.out.println(27.78/zero_to_100_inseconds+"m/sec sq");
    }
    void brake(int hundred_to_0_inseconds){
        System.out.println("-"+27.78/hundred_to_0_inseconds+"m/sec sq");
    }
    void display_info(){
        System.out.println("Make : "+make+" , Model : "+model+" , Year : "+year);
    }
}
public class carwithpropertiesclass{
    public static void main(String[] args) {
        Car c1= new Car("KIA","Seltos",2024);
        c1.accelerate(10);
        c1.brake(12);
        c1.display_info();     
    }
}