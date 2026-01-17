import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        RandomStrategdy randomStrategdy = new RandomStrategdy();
        ParkingSpot p1_l1 = new ParkingSpot("L1_P1");
        ParkingSpot p2_l1 = new ParkingSpot("L1_P2");
        ParkingSpot p3_l1 = new ParkingSpot("L1_P3");
        ParkingSpot p1_l2 = new ParkingSpot("L2_P1");
        List<ParkingSpot> list = new ArrayList<>();
        list.add(p1_l1);
        list.add(p2_l1);
        TwoWheelerManager b1_l1_two = new TwoWheelerManager(list, randomStrategdy);
        FourWheelerManager b1_l1_four = new FourWheelerManager(List.of(p3_l1), randomStrategdy);
        TwoWheelerManager b1_l2_two = new TwoWheelerManager(List.of(p1_l2), randomStrategdy);
        Map<VehicleType, ParkingSpotManager> map = new HashMap<>();
        map.put(VehicleType.TWO_WHEELER, b1_l1_two);
        map.put(VehicleType.FOUR_WHEELER, b1_l1_four);
        Map<VehicleType, ParkingSpotManager> map1 = new HashMap<>();
        map1.put(VehicleType.TWO_WHEELER, b1_l2_two);
        Level level1 = new Level(1, map);
        Level level2 = new Level(2, map1);
        Building building = new Building(List.of(level1, level2));
        Vehicle bike1 = new Vehicle("KA-01-12345", VehicleType.TWO_WHEELER);
        EntryGate e = new EntryGate();
        Ticket ticket1 = e.Entry(bike1, building);
        System.out.println("Bike1 parked at Level: " + ticket1.levelId + " Spot: " + ticket1.parkingSpot.parkingSpotId);
        Vehicle car1 = new Vehicle("KA-01-54321", VehicleType.FOUR_WHEELER);
        Ticket ticket2 = e.Entry(car1, building);
        System.out.println("Car1 parked at Level: " + ticket2.levelId + " Spot: " + ticket2.parkingSpot.parkingSpotId);
        Vehicle Bike2 = new Vehicle("KA-01-67890", VehicleType.TWO_WHEELER);
        Vehicle Bike3 = new Vehicle("KA-01-09876", VehicleType.TWO_WHEELER);
        Ticket ticket3 = e.Entry(Bike2, building);
        System.out.println("Bike2 parked at Level: " + ticket3.levelId + " Spot: " + ticket3.parkingSpot.parkingSpotId);
        Ticket ticket4 = e.Entry(Bike3, building);
        if(ticket4 != null) {
            System.out.println("Bike3 parked at Level: " + ticket4.levelId + " Spot: " + ticket4.parkingSpot.parkingSpotId);
        } else {
            System.out.println("No parking spot available for Bike3");
        }
        ExitGate exitGate = new ExitGate(new CostComputation(new FixedPriceStrategdy()));
        exitGate.completeExit(ticket1, building, new CashPayment());


        System.out.println("Bike1 unparked from Level: " + ticket1.levelId + " Spot: " + ticket1.parkingSpot.parkingSpotId);

    }
}