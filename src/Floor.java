import java.util.List;

public class Floor {
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpots;

    public Floor(int floorNumber, List<ParkingSpot> parkingSpots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}