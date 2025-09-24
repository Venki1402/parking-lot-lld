import java.util.List;

public interface ParkingSpotStrategy {
    ParkingSpot findSpot(List<Floor> floors, Vehicle vehicle);
}