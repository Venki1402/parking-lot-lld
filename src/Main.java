import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ParkingSpot s1 = new ParkingSpot("S1", SpotSize.CAR, false);
        ParkingSpot s2 = new ParkingSpot("S2", SpotSize.BUS, true);
        Floor f1 = new Floor(1, Arrays.asList(s1, s2));

        ParkingLot lot = new ParkingLot(
                Arrays.asList(f1),
                Arrays.asList(new EntryGate("E1")),
                Arrays.asList(new ExitGate("X1")),
                new NearestParkingSpotStrategy());

        Vehicle v = new Vehicle("V123", VehicleType.CAR, true);

        ParkingSpot spot = lot.findAvailableSpot(v);
        spot.assignVehicle(v);

        EntryGate entry = lot.getEntryGates().get(0);
        Ticket ticket = entry.issueTicket(v, spot);

        // simulating some wait time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        ExitGate exit = lot.getExitGates().get(0);
        Payment payment = exit.processPayment(ticket, PaymentMode.UPI);

        System.out.println("Payment Rs: " + payment.getAmount());
    }
}