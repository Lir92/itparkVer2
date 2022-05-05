package lesson9.HomeWork_Lessen9;

import java.util.Random;

public class Driver {

    public static void main(String[] args) {

        PassengerCar myPassCar = new PassengerCar(0);
        Truck myTruck = new Truck(0);

        String[] passCarMassive = new String[] {"Volkswagen", "Peugeot", "BMW", "Audi", "AlphaRomeo", "Lada",
                "Seat", "Toyota", "Nissan", "Subaru"};
        String [] truckList = new String[] {"Volvo", "Mercedes", "Scania", "MAN", "DAF", "Iveco", "GMC", "Ural",
                "KAMAZ", "KRAZ"};

        Random random = new Random(); // выбираем случайный автомобиль: чётный - грузовики, нечётные - легковые
        int someVehicle = random.nextInt(10);
        if (someVehicle % 2 == 0){
            System.out.print("Грузовой автомобиль " + truckList[someVehicle]);
            myTruck.move(getSomeDistance());
        } else {
            System.out.print("Легковой автомобиль " + passCarMassive[someVehicle]);
            myPassCar.move(getSomeDistance());
        }
    }

    private static int getSomeDistance() {
        Random random = new Random();
        return random.nextInt(1600);
    }
}