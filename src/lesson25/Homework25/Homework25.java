package lesson25.Homework25;

/**
 * AIT-TR, cohort 42.1, Java Basic, #25
 * @author Alexandru Postica
 * @version 13.Mar
 */
public class Homework25 {
    public static void main(String[] args) {

        // task #1
        Human[] humans = {new Human(10, 15), new NoProfRun(15,10),new NoProfRun(15,10),new ProfRun(20,5)};
        for (Human human: humans) {
            System.out.println(human.run());
            System.out.println(human.rest());
        }

        // task #2
        Vehicle[] vehicles = {new Vehicle(), new Becycle(), new Car()};
            for (Vehicle vehicle: vehicles) {
                System.out.println(vehicle.startEngine());
        }

        // task #3
        Figura[] figuras = {new Figura(), new Squere(5), new Circle(5), new Triangle(5)};
            for (Figura figura: figuras) {
                System.out.println(figura.calcArea());
            }
    }
}
