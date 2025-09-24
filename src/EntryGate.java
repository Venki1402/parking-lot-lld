import java.time.LocalDateTime;
import java.util.UUID;

public class EntryGate {
    private final String gateId;

    public EntryGate(String gateId) {
        this.gateId = gateId;
    }

    public Ticket issueTicket(Vehicle vehicle, ParkingSpot spot) {
        return new Ticket(UUID.randomUUID().toString(), LocalDateTime.now(), vehicle, spot);
    }

    public String getGateId() {
        return gateId;
    }
}