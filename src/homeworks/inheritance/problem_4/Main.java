package homeworks.inheritance.problem_4;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setPassengerCount(2);
        truck.setEngineType('a');
        System.out.println(truck.getPassengerCount() + " " + truck.getEngineType() + " " + truck.getCapacity());
    }
}
