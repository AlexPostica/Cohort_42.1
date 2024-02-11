package lesson12;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5, 7, 8, 9, 23, 45, 67, 78, 89, 99};
        int digit = 23;
        int index = binarySearch(arr, digit);
        if (index != -1){
            System.out.println(digit);
        }else {
            System.out.println("Wrong " + digit);
        }
    }

    public static int binarySearch(int[] arr, int digit) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int current = arr[middle];
            if (current == digit) {
                return middle;
            } else if (current < digit) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}