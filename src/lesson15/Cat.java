package lesson15;

public class Cat {
    String name;
    String color;
    int age;
    int volume;
    int food;
    int energy;

    public Cat(String name, String color, int age, int volume) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;
    }

    public void eat(int food) {
        this.food = food;
        energy += food;
        System.out.print("Procent: ");
    }

    public double satieted() {
        return (double) food / volume * 100;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public int walk() {
        if (energy > 10){
            System.out.println("I can walk");
            energy -= 10;
        }else {
            eat(10);
            System.out.println("The cat must eat");
        }
        return energy;
    }
    public int run() {
        if (energy > 20){
            energy -= 20;
            System.out.println("I can run");
        } else {
            eat(20);
            System.out.println("The cat must eat");
        }
        return energy;
    }
}
