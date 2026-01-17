public class Main {
    /********** The Strategy pattern is a behavioral design pattern that defines multiple algorithms, encapsulates their logic in dedicated classes, and enables changing an algorithm's behavior at runtime. It's particularly useful when you have multiple ways to perform a task and want to choose the approach dynamically. }
     * Vehicle Manufacturing → Different cars(like SUVs, EVs, etc) require different drive modes.
     * 1. Massive Conditional Blocks leading to bloated classes
     * 2. Violation of the Open/Closed Principle and Single Responsibility Violation
     * 3. Code Duplication
     * 4. Tight Coupling
     * 5. Testing Complexity *********/
    public static void main(String[] args) {
        Vehicle v = new OffRoadVehicle(new SportDriveStrategy());
        v.performDrive();
        System.out.println("Hello, World!");
    }
}