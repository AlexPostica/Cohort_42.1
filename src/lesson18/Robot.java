package lesson18;

public class Robot {

    public static final String COMPANY_NAME = "Boston Dynamics";

    private int countCPU;
    private int sum;
    private boolean isConnected;

    private static int count;

    public Robot(int countCPU) {
        this.countCPU = countCPU;
        this.sum = sum;
        count++;
    }
    // task 1
    public boolean isCharger () {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Robot connected to the charger.");
        }
        return isConnected;
    }
    // task 1 #2
    public boolean noCharger() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Robot disconnected from the charger.");
        }
        return isConnected;
    }

    public static int getCount() {
        return count;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public void addAndSave(int a) {
        sum += a;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "countCPU=" + countCPU +
                '}';
    }
}
