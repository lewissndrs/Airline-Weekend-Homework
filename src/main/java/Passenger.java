public class Passenger {

    private String name;
    private int bags;
    private String flight;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = "";
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flightNo) {
        this.flight = flightNo;
    }
}
