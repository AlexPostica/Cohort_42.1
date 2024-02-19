package lesson16;
/**
 * AIT-TR, cohort 42.1, Java Basic, #14
 * @author Alexandru
 * @version 19.Feb
 */
public class Lesson16 {
    public static void main(String[] args) {
        Cat cat = new Cat(30);
        Plate plate = new Plate(50);

        plate.add(40);
        cat.eat(plate);

        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);
    }
}
