public class Vehicle {
    private final String vehicleId;
    private final VehicleType type;
    private final boolean isElectric;

    public Vehicle(String vehicleId, VehicleType type, boolean isElectric) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.isElectric = isElectric;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isElectric() {
        return isElectric;
    }
}