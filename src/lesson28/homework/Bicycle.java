package lesson28.homework;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPotDiameter;

    public Bicycle(String model, int weight, int seatPotDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPotDiameter = seatPotDiameter;
    }

    public void start() {
        System.out.println("start");
    }

    public static class HandleBar {
        public void right() {
            System.out.println("Right rudder!");
        }
        public void left() {
            System.out.println("Left rudder!");
        }
    }

    public static class Seat {
        public void up() {
            System.out.println("The seat is raised higher!");
        }
        public void down() {
            System.out.println("The seat is lowered!");
        }
    }

    public void seatPotDiameter() {
        System.out.println("Seat parameter: seatpost diameter = " + Bicycle.this.seatPotDiameter);
    }
}
