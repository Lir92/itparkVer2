package lesson9.HomeWork_Lessen9;

public abstract class Vehicle {

    private int distance;

    public Vehicle(int newDistance) {
        this.distance = newDistance;
    }

    abstract int move(int distance);

    @Override
    public String toString() {
        return "Vehicle{" +
                "distance=" + distance +
                '}';
    }
}