package lesson27.homework27;

public class Triathlete implements Runner , Swimmer{
    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void swimm() {
        System.out.println("Swimm");
    }
}
