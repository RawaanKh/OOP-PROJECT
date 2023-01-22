import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AirPlane extends Trip {

    public AirPlane(String tripNum, double distance, double speed, String startTime) {
        super(tripNum, distance, speed, startTime);
    }

    @Override
    public long calcDuration() throws ParseException {
        SimpleDateFormat format=new SimpleDateFormat("HH:mm");
        Date d1 =format.parse(super.getStartTime());
        Date d2 =format.parse(calcArrivalTime());
        long sub=(d2.getTime()-d2.getTime());
        return sub;
    }


}
