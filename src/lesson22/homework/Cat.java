package lesson22.homework;

public class Cat extends Animal{
    protected String color;


    public Cat(int age, String color) {
        super(age);
        this.color = String.valueOf(color);
    }

    @Override
    public String voice() {
        return "meaw!";
    }

    @Override
    public String   toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
