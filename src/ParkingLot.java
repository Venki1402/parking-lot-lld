import java.util.List;

public class ParkingLot {
    private final List<Floor> floors;
    private final List<EntryGate> entryGates;
    private final List<ExitGate> exitGates;
    private ParkingSpotStrategy allocationStrategy;

    public ParkingLot(List<Floor> floors,
            List<EntryGate> entryGates,
            List<ExitGate> exitGates,
            ParkingSpotStrategy strategy) {
        this.floors = floors;
        this.entryGates = entryGates;
        this.exitGates = exitGates;
        this.allocationStrategy = strategy;
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle) {
        return allocationStrategy.findSpot(floors, vehicle);
    }

    public boolean isFull() {
        return findAvailableSpot(new Vehicle("dummy", VehicleType.CAR, false)) == null;
    }

    public void setAllocationStrategy(ParkingSpotStrategy strategy) {
        this.allocationStrategy = strategy;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public List<EntryGate> getEntryGates() {
        return entryGates;
    }

    public List<ExitGate> getExitGates() {
        return exitGates;
    }
}