import java.time.LocalDateTime;

public class Ticket {
    private final String ticketId;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private final Vehicle vehicle;
    private final ParkingSpot spot;

    public Ticket(String ticketId, LocalDateTime entryTime, Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }
}