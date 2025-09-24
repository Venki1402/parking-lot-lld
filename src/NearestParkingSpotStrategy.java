import java.util.List;

public class NearestParkingSpotStrategy implements ParkingSpotStrategy {

    @Override
    public ParkingSpot findSpot(List<Floor> floors, Vehicle vehicle) {
        for (Floor floor : floors) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if (!spot.isOccupied() && isCompatible(spot, vehicle)) {
                    return spot;
                }
            }
        }
        return null;
    }

    private boolean isCompatible(ParkingSpot spot, Vehicle vehicle) {
        if (spot.isEVOnly() && !vehicle.isElectric())
            return false;

        SpotSize size = spot.getSize();
        VehicleType type = vehicle.getType();

        if (type == VehicleType.BIKE)
            return size == SpotSize.BIKE;
        if (type == VehicleType.CAR)
            return size == SpotSize.CAR || size == SpotSize.BUS;
        return size == SpotSize.BUS;
    }
}