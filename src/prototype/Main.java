package prototype;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        Vehicle clonedCar = car.clone();
        Vehicle clonedMotorcycle = motorcycle.clone();


        clonedCar.start();
        clonedCar.stop();
        clonedMotorcycle.start();
        clonedMotorcycle.stop();
    }
}
