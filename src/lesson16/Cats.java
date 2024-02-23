package lesson16;

public class Cats {
    int maxVolume;

    int realVolume;

    public Cats(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;
    }

    public void eat(Plate plate) {
        int food = plate.amountFood();
        if (food > maxVolume - realVolume) {
            food = maxVolume - realVolume;
        }
        realVolume += food;
        plate.feeding(food);
    }
}
