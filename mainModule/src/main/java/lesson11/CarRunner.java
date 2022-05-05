package lesson11;

public class CarRunner {

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.setDistance(100000);
        car.setMark("Shkoda");
        car.setModel("Rapid");
        car.setEngine(car.new Engine(1.4));
        //car.setEngine(new Car.Engine(1.4)); // если класс Engine делаем static

        car.new Engine(1.4);
        // new Car.Engine(1.6);

        Object carClone = car.clone();
        System.out.println(car);
        System.out.println(carClone);
    }
}
