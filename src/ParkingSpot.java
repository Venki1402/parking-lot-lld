public class ParkingSpot {
    private final String spotId;
    private final SpotSize size;
    private final boolean isEVOnly;
    private boolean isOccupied;
    private Vehicle currentVehicle;

    public ParkingSpot(String spotId, SpotSize size, boolean isEVOnly) {
        this.spotId = spotId;
        this.size = size;
        this.isEVOnly = isEVOnly;
        this.isOccupied = false;
    }

    public synchronized void assignVehicle(Vehicle vehicle) {
        if (isOccupied)
            throw new IllegalStateException("Spot already occupied");
        this.currentVehicle = vehicle;
        this.isOccupied = true;
    }

    public synchronized void removeVehicle() {
        this.currentVehicle = null;
        this.isOccupied = false;
    }

    public String getSpotId() {
        return spotId;
    }

    public SpotSize getSize() {
        return size;
    }

    public boolean isEVOnly() {
        return isEVOnly;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }
}