public class SEDAN implements IVehicleType{

    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public SEDAN(
                int distanceKM,
                int timeMinutes,
                int numberOfPassengers) {

        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public int perHeadFare() {
        int fare = -1;
        fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
        return fare;
    }

    @Override
    public boolean canTakeTrip() {
        return false;
    }
}
