package lesson28.homework;
/**
 * AIT-TR, cohort 42.1, Java Basic,hw #28
 * @author Alexandru Postica
 * @version 24.Mar
 */
public class HomeWork28 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Scott", 29, 40);
        Bicycle.HandleBar handleBar = new Bicycle.HandleBar();
        Bicycle.Seat seat = new Bicycle.Seat();

        bicycle.start();
        seat.up();
        handleBar.left();
        handleBar.right();
    }
}
