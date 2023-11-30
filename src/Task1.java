import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car){
                Car myCar = (Car) vehicle;
                myCar.start();
                myCar.stop();
            }
            else if (vehicle instanceof Motorcycle){
                Motorcycle myMotorcycle = (Motorcycle) vehicle;
                myMotorcycle.start();
                myMotorcycle.stop();
            }
            System.out.println("--------------------------------------------");
        }
    }
}

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Машина почала рух");
    }

    @Override
    public void stop() {
        System.out.println("Машина зупинилася");
    }
}

class Motorcycle implements Vehicle{

    @Override
    public void start() {
        System.out.println("Мотоцикл почав рух");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл зупинився");
    }
}