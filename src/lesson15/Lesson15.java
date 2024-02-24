package lesson15;
/**
 * AIT-TR, cohort 42.1, Java Basic, #15
 * @author Alexandru Postica
 * @version 16.Feb
 */
public class Lesson15 {
    public static void main(String[] args) {
        Cat cat = new Cat("Mursik", "White", 3, 100);
        cat.voice();
        System.out.println(cat.name +  ", " + cat.color + ", " + cat.age);
        cat.eat(10);
        System.out.println(cat.satieted());
        System.out.println(cat.walk());
        System.out.println();

        Cat cat1 = new Cat("Barsik", "Black", 5, 100);
        cat1.voice();
        System.out.println(cat1.name +  ", " + cat1.color + ", " + "age " + cat1.age);
        cat1.eat(80);
        System.out.println(cat1.satieted());
        System.out.println(cat1.run());

        // HomeWork class Car
        Car car = new Car(5,6);
        car.refuel(20);
        if (car.engineOn()) {
            System.out.printf("Drive: " + car.drive(40));
        }
    }
}
