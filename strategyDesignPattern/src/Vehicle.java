public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void performDrive() {
        driveStrategy.drive();
    }
}
