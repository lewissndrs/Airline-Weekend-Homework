import sun.invoke.empty.Empty;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String origin;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String origin, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
    }

    public PlaneType getPlane() {
        return this.plane.getPlaneType();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getEmptySeats() {
        int EmptySeats = this.plane.getPlaneCapacity() - this.passengers.size();
        return EmptySeats;
    }

    public void bookPassenger(Passenger passenger){
        if (getEmptySeats() > 1) {
            passengers.add(passenger);
        }
    }
}
