package lesson16;

import lesson15.HomeWork15.PetrolStation;

public class Car {
    int maxVolume;
    public int realVolume;

    public Car(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;
    }
    public void refill(PetrolStation petrolStation) {
        int fuel = petrolStation.amountFuel();
        if(fuel > maxVolume - realVolume) {
            fuel = maxVolume - realVolume;
        }
        realVolume += fuel;
        petrolStation.add(fuel);
    }
}
