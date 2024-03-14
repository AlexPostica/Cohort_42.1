package lesson22.homework;

public class Animal {
    protected int age;


    public String voice() {
        return "Unknow";
    }

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}
