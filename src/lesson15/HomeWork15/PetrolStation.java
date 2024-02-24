package lesson15.HomeWork15;

public class PetrolStation {
    int capacity;
    int fuel;

    public PetrolStation(int capacity) {
        this.capacity = capacity;
        this.fuel = 0;
    }
    public void add(int fuel) {
        if (this.fuel + fuel <= capacity) {
            this.fuel += fuel;
        } else {
            System.out.println("Cannot add fuel, capacity exceeded");
        }
    }
    public int amountFuel() {
        return fuel;
    }
}
