package Exercises;

public class ArrayApp {

    private static int i;

    public static void main(String[] args) {
        int nElems = 0;
        long searchKey;
        int[] arr = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
        nElems = arr.length;

        for (i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        searchKey = 66; // Find an item with a key of 66
        for(i=0; i<nElems; i++) // For each item
            if(arr[i] == searchKey) // Value Found
                break; // Yes - Exit the loop
        if (i == nElems) // The last element has been reached
            System.out.println("I can't find " + searchKey); // Yes
        else
            System.out.println("I found " + searchKey); // No

        searchKey = 55; // Delete an item with a key of 55
        for(i=0; i<nElems; i++) // Find an item to delete
            if(arr[i] == searchKey)
                break;
        for(int k=i; k<nElems-1; k++) // Shifting Subsequent Elements
            arr[k] = arr[k+1];
        nElems--; // Reducing the size
        for(i=0; i<nElems; i++) // Displaying Elements
            System.out.print( arr[i] + " ");
        System.out.println("");
        System.out.println("Item is deleted " + searchKey);// End of ArrayApp Class
    }
}
