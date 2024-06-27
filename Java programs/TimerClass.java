//Create a class representing a Timer with methods to start, stop, and reset.
import java.util.*;
class Timer{
    void start(double startTime){
        System.out.println("Timer started at :"+startTime);
    }
    void stop(double endTime){
        System.out.println("Timer stopped at :"+endTime);
    }
    void reset(){
        System.out.println("Timer resetted.");
    }

}
public class TimerClass{
    public static void main(String[] args) {
        Timer t1=new Timer();
        t1.start(9.46);
        t1.stop(10.44);
        t1.reset();
    }
}