import java.util.Arrays;
import java.util.Random;
 
public class BubbleSort {
    private int[] data;
    public static final int RANDOM = 0;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    
    // create array of given size and fill with random integers
    public BubbleSort( int size ) {
        this( size, RANDOM );
    }
    
    // create array of given size and fill with integers in a specified order
    public BubbleSort( int size, int order ) {
        Random generator = new Random();
        data = new int[ size ];
        
        for ( int i = 0; i < size; i++ ) {
            data[ i ] = 100 + generator.nextInt(900);
            // BETTER: data[ i ] = generator.nextInt();
        }
        
        if (order == RANDOM)
            return;
        else {
            Arrays.sort(data);
            if (order == ASCENDING)
                return;
            else if (order == DESCENDING) {
                for(int i=0; i < data.length / 2; i++) {
                    // swap the elements
                    swap( i, data.length-(i+1) );
                }
            }
        }
    }
    
    // sort array using bubble sort - level 1
    public void bubbleSortv1() {
        for ( int pass=1; pass < data.length; pass++ ) {
            for ( int index=0; index < data.length-1; index++ ) {
                // Compare adjacent elements and swap them if necessary
                if ( data[index] > data[index+1] ) {  
                    swap( index, index+1 );
                }
            }
            // Output for testing purposes only, REMOVE if timing the algorithm!
            //System.out.printf( "After pass #%2d, array is: %s", pass, this );
        } 
    }
    
    // sort array using bubble sort - level 2
    public void bubbleSortv2()
    {
        for ( int pass=1; pass < data.length; pass++ ) {
            for ( int index=0; index < data.length-pass; index++ ) {
                // Compare adjacent elements and swap them if necessary
                if ( data[index] > data[index+1] ) {  
                    swap( index, index+1 );
                }
            }
            // Output for testing purposes only, REMOVE if timing the algorithm!
            //System.out.printf( "After pass #%2d, array is: %s", pass, this );
        } 
    }
    
    // sort array using bubble sort - level 3
    public void bubbleSortv3() {
        boolean exchangeMade = true;
        
        for ( int pass=1; pass < data.length && exchangeMade; pass++ ) {
            exchangeMade = false;
            for ( int index=0; index < data.length-pass; index++ ) {
                // Compare adjacent elements and swap them if necessary
                if ( data[index] > data[index+1] ) {  
                    swap( index, index+1 );
                    exchangeMade = true;
                }
            }
            // Output for testing purposes only, REMOVE if timing the algorithm!
           // System.out.printf( "After pass #%2d, array is: %s", pass, this );
        }
    }

    // PUBLIC method to start the private recursive quickSort()
    // and pass in the first and last index of the data array.
    public void quickSort( ) {
        quickSort( 0, data.length - 1 );
    }

    // PRIVATE recursive method to perform the quick sort, 
    // requires left and right indices (internal details).
    private void quickSort(int leftIndex, int rightIndex) {
        // base case: if subarray size is 1, then it's sorted
        if ( rightIndex - leftIndex <= 0 ) 
            return;
        // Otherwise, there are 2 or more elements in this subarray
        else {
            // Partition the subarray
            int indexOfPivot = partitionIt( leftIndex, rightIndex );
            
            // Sort the left side
            quickSort( leftIndex, indexOfPivot - 1 );
            
            // Sort the right side
            quickSort( indexOfPivot, rightIndex );  
        }
    }

    // helper method to partition the array
    private int partitionIt(int leftIndex, int rightIndex) {
        int pivotValue = data[(leftIndex + rightIndex) / 2];
        
        while ( leftIndex <= rightIndex) {
            while ( data[leftIndex] < pivotValue )
                leftIndex++;
            while ( data[rightIndex] > pivotValue )
                rightIndex--;
            if ( leftIndex <= rightIndex ) {
                swap( leftIndex, rightIndex );
                leftIndex++;
                rightIndex--;
            }
        }
        
        return leftIndex;
    } 
    
    // helper method to swap values in two data elements
    private void swap( int first, int second ) {
        int temporary = data[ first ];  
        data[ first ] = data[ second ]; 
        data[ second ] = temporary;     
    } 
    
    // Return string representing all elements in array
    public String toString() {
        return Arrays.toString( data ) + "\n";
    } 
}