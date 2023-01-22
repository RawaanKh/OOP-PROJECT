import java.text.ParseException;

public abstract class Trip {
    private String tripNum;
    private double distance;
    private double speed;
    private String startTime; // want to convert

    public Trip(String tripNum, double distance, double speed, String startTime) {
        this.tripNum = tripNum;
        this.distance = distance;
        this.speed = speed;
        this.startTime = startTime;
    }

    public String getTripNum() {
        return tripNum;
    }

    public void setTripNum(String tripNum) {
        this.tripNum = tripNum;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public abstract long calcDuration () throws ParseException;

    public double ConvertMinToHour(int min) {
        double minute = (double) min;
        return minute / 60;
    }

    public String calcArrivalTime() {

        int myStartTime=Integer.parseInt(startTime);
        int DueTime=(int)(distance/speed);
        double arrival= ConvertMinToHour(DueTime)+myStartTime;
        return String.valueOf(arrival);
        
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripNum='" + tripNum + '\'' +
                ", distance=" + distance +
                ", speed=" + speed +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}