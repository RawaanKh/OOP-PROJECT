import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Car car= new Car("1",50.3,160.5,"3");
        Train train = new Train("2",278.1,200.0,"3");
        AirPlane airplane= new AirPlane("3",50.3,500.0,"3");
        System.out.println(car.calcDuration());
        System.out.println(car.calcArrivalTime());
        System.out.println(car.toString());
        System.out.println(train.calcDuration());
        System.out.println(train.calcArrivalTime());
        System.out.println(train.toString());
        System.out.println(airplane.calcDuration());
        System.out.println(airplane.calcArrivalTime()  );
        System.out.println(airplane.toString());



    }
}