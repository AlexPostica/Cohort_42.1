package lesson15;

public class Car {
    int fuel;
    int volumeMax;
    boolean engineStart;

    public Car(int fuel, int volumeMax) {
        this.fuel = fuel;
        this.volumeMax = volumeMax;
        engineStart = false;
    }

    public void refuel(int fuel) {
        if (this.fuel + fuel > volumeMax) {
            this.fuel += volumeMax;
            return;
        }
        this.fuel += fuel;
    }

    public boolean engineOn() {
        engineStart = fuel > 0;
        return engineStart;
    }

    public int drive(int distance) {
        if (!engineStart) {
            return 0;
        }
        fuel -= 0.05 * distance;
        return distance;
    }
}
