package lesson18;

public class Robot {

    public static final String COMPANY_NAME = "Bostan Daynamix";
    private int countCPU;

    private static int count;

    public Robot(int countCPU) {
        this.countCPU = countCPU;
        countCPU++;
    }

    public static int getCount() {
        return count;
    }

    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "countCPU=" + countCPU +
                '}';
    }
}
