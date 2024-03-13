package lesson25.Homework25;

public class Human {
    protected int speed;
    protected int rest;

    public Human(int speed, int rest) {
        this.speed = speed;
        this.rest = rest;
    }

    public String run() {
        return "Run with speed: " + speed + "km/h";
    }

    public String rest() {
        return "Rest: " + rest + "min";
    }

}
