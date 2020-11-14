public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }


    public int getTotalBaggageSpace() {
        return flight.getPlane().getTotalWeight() / 2;
    }

    public double getTotalBookedBaggage() {
        double totalBaggageDouble = getTotalBaggageSpace();
        double capacityDouble = flight.getPlane().getCapacity();
        return totalBaggageDouble / capacityDouble;
    }

    public double getRemainingBaggageSpace() {
        double totalBaggageSpaceDouble = getTotalBaggageSpace();
        return totalBaggageSpaceDouble - getTotalBookedBaggage();
    }
}
