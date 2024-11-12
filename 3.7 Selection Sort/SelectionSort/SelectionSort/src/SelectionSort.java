import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    private int[] array;
    public static final int RANDOM = 0;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;


    public SelectionSort(int size){
        this(size, RANDOM);
    }
    
    public SelectionSort(int size, int order) {
        Random rand = new Random();
        array = new int[size];
    
        for (int i = 0; i < size-1; i++) {
            array[i] = rand.nextInt(100);
        }

        if (order == RANDOM){
            sort(array);
        }   
        else {
            if (order == ASCENDING)
                return;
            else if (order == DESCENDING) {
                for(int i=0; i < array.length / 2; i++) {
                    // swap the elements
                    swap(array, i, array.length-(i+1) );
                }
            }
        }
    }

    private void sort(int[] array) {
        for (int x = 0; x < array.length - 1; x++) {
            int smallestIndex = x;
            for (int i = x + 1; i < array.length; i++) {
                if (array[i] < array[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            swap(array, x, smallestIndex);
            System.out.println(toString());
        }
    }
    
    private void swap(int[] array, int index1, int index2) {
        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
    } 

    @Override
    public String toString() {
        return Arrays.toString( array ) + "\n";
    } 
   
}
