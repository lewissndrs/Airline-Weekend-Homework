public enum PlaneType {
    BOEING747(366,1000),
    AIRBUSA330(277,550),
    AIRBUSA220(108,220),
    BOEING737(230,750),
    BOEING787DREAMLINER(242,800),
    ANTONOVAN148(85,195);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
