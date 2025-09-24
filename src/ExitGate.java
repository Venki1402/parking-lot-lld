import java.time.Duration;
import java.util.UUID;

public class ExitGate {
    private final String gateId;

    public ExitGate(String gateId) {
        this.gateId = gateId;
    }

    public double calculatePayment(Ticket ticket) {
        ticket.setExitTime(java.time.LocalDateTime.now());
        long minutes = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toMinutes();
        double rate = 2.0;
        if (ticket.getSpot().getSize().equals(SpotSize.BUS))
            rate *= 1.5;
        if (ticket.getVehicle().isElectric() && ticket.getSpot().isEVOnly()) {
            rate += 1.0;
        }
        return minutes * rate;
    }

    public Payment processPayment(Ticket ticket, PaymentMode mode) {
        double amount = calculatePayment(ticket);
        return new Payment(UUID.randomUUID().toString(), amount, mode);
    }

    public String getGateId() {
        return gateId;
    }
}