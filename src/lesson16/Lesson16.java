package lesson16;
/**
 * AIT-TR, cohort 42.1, Java Basic, #14
 * @author Alexandru
 * @version 19.Feb
 */
public class Lesson16 {
    public static void main(String[] args) {
        Cats cat = new Cats(30);
        Cats[]cats = new Cats[3];
        cats[0] = new Cats(15);
        cats[1] = new Cats(20);
        cats[2] = new Cats(35);
        Plate plate = new Plate(100);
        plate.add(80);
        cat.eat(plate);
        for (Cats cats1: cats) {
            cat.eat(plate);
            System.out.println("Cat: " + plate.amountFood());
        }
        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);
    }
}
