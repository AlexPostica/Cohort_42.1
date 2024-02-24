package lesson15.HomeWork15;

import lesson16.Car;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #15
 * @author Alexandru Postica
 * @version 22.Feb
 */
public class HomeWork15 {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation(2999);
        Car[] cars = new Car[3];
        cars[0] = new Car(54);
        cars[1] = new Car(65);
        cars[2] = new Car(89);
        petrolStation.add(300);
        for (Car car : cars) {
            car.refill(petrolStation);
            System.out.println("Refuelling the car, petrol in the car: " + car.realVolume);
            System.out.println("Feul: " + petrolStation.fuel);
            System.out.println();
        }
    }
}
