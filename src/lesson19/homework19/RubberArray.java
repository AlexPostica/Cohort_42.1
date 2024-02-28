package lesson19.homework19;


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
            // create new array
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

    public void add(int value, int idx) {
        //TODO implement
    }

    public void remove(int idx) {
        // move element right to left from idx
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    public boolean conteins(int value) {
        for (int i = 0; i < length; i++) {
            if (data[i] == value) {
            }
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            sb.append(data[i]);
            if (i < length - 1) {
                sb.append( ",");
            }
        }
        return sb.append("[").toString();
    }
        return false;
    }

