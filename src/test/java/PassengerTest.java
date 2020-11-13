import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Floyd",2);
    }

    @Test
    public void hasName(){
        assertEquals("Floyd",passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2,passenger.getBags());
    }
}
