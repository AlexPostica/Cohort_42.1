package lesson15;

public class Cat {
    String name;
    String color;
    int age;
    int volume;
    int food;

    public Cat(String name, String color, int age, int volume) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;
    }

    public void eat(int food) {
        this.food = food;
        System.out.print("Procent: ");
    }

    public double satieted() {
        return (double) food / volume * 100;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public int walk() {
        if (food > 10){
            System.out.println("Walk");
            food -= 10;
        }else {
            System.out.println("The cat must eat");
        }
        return food;
    }
    public int run() {
        if (food > 20){
            food -= 20;
            System.out.println("Run");
        } else {
            System.out.println("The cat must eat");
        }
        return food;
    }
}
