package lesson25.Homework25;

public class Homework25 {
    public static void main(String[] args) {
        Human human = new Human(10, 15);
        System.out.println(human.run());
        System.out.println(human.rest());
        NoProfRun noProfRun = new NoProfRun(15,10);
        System.out.println(noProfRun.run());
        System.out.println(noProfRun.rest());
        ProfRun profRun = new ProfRun(20,5);
        System.out.println(profRun.run());
        System.out.println(profRun.rest());
    }
}
