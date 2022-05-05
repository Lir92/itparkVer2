package lesson9.HomeWork_Lessen9;

public class PassengerCar extends Vehicle {

    private final int distanceLimit = 500;

    public PassengerCar(int distance) {
        super(distance);
    }

    @Override
    protected int move(int distance) {
        if (distance <= 0) {
            System.out.println(" стоит на месте.");
        } else if (distance <= distanceLimit){
            System.out.println(" проехал " + distance + " километров на одном баке.");
        } else {
            System.out.println(" не сможет проехать " + distance + " километров на одном баке.");
        }
        return distance;
    }
}