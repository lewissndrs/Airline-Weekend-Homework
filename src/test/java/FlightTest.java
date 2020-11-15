import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Date date1;

    @Before
    public void before(){
        date1 = new Date(2020/10/10);
        passenger1 = new Passenger("Ted",2);
        plane = new Plane(PlaneType.AIRBUSA220);
        flight = new Flight(plane,"GLA2020","GLA","AMS",date1);
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.AIRBUSA220,flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("GLA2020",flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA",flight.getDestination());
    }

    @Test
    public void hasOrigin(){
        assertEquals("AMS",flight.getOrigin());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals(date1,flight.getDepartureTime());
    }

    @Test
    public void canGetEmptySeats(){
        assertEquals(108,flight.getEmptySeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(107,flight.getEmptySeats());
    }

    @Test
    public void PassengerHasFlightProperty(){
        flight.bookPassenger(passenger1);
        assertEquals("GLA2020",passenger1.getFlight());
    }
}
