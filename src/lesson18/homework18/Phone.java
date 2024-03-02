package lesson18.homework18;

public class Phone {
    public static final String COMPANY_NAME = "ALEX_TECHNOLOGY";

    private int sum;

    public static int getCount() {
        return count;
    }

    private static int count;

    public Phone() {
        this.sum = sum;
        count++;
    }
    public boolean isCharger (boolean isConnected) {
        if (isConnected) {
            System.out.println("Robot connected to the charger.");
        } else {
            System.out.println("Robot disconnected from the charger.");
        }
        return isConnected;
    }
}
