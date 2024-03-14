package lesson22.homework;

public class Tiger extends Cat{

    protected String name;

    public Tiger(int age, String color, String name) {
        super(age, color);
        this.name = name;
    }

    @Override
    public String voice() {
        return "Rrrrr...";
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
