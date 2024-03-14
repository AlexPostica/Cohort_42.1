package lesson19;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm #19
 * @author Alexandru Postica
 * @version 1.Mar
 */
public class RubberArray {

    private final int INIT_DATA_SIZE = 10;
    private final float EXTEND_INDEX = 1.5f;
    private int[] data;
    private int length;

    public RubberArray() {
            data = new int[INIT_DATA_SIZE];
            length = 0;
    }

    public int get(int idx) {
        return data[idx];
    }

    public void add(int value) {
        if (length == data.length) {
            // create new array, length *= 1.5
            int[] newData = new int[(int) (length * EXTEND_INDEX)];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        // add value
        data[length] = value;
        length++;
    }

    public void remove(int idx) {
        // move element right to left from idx
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            str.append(String.valueOf(data[i]));
            if (i < length - 1) {
                str.append(",");
            }
        }
        return str + "]";
    }
}
