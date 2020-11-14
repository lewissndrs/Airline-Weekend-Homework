import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Floyd",3);
        plane = new Plane(PlaneType.AIRBUSA220);
        flight = new Flight(plane,"BA4200","AMS","GLA","16:20");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canCalculateTotalBaggageSpace(){
        assertEquals(110,flightManager.getTotalBaggageSpace());
    }

    @Test
    public void canCalculateTotalBookedBaggage(){
        flight.bookPassenger(passenger1);
        assertEquals(1.02, flightManager.getTotalBookedBaggage(), 0.01);
    }

    @Test
    public void canCalculateRemainingBaggageSpace() {
        flight.bookPassenger(passenger1);
        assertEquals(108.98,flightManager.getRemainingBaggageSpace(),0.01);
    }
}
