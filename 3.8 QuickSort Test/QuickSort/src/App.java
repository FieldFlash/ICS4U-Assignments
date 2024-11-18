public class App {
    public static void main(String[] args) throws Exception {
        // Timing system
        long time = System.currentTimeMillis();

        // create object to perform bubble sort
        BubbleSort bubbleSort = new BubbleSort( 100000, BubbleSort.RANDOM );
        BubbleSort quickSort = new BubbleSort( 100000, BubbleSort.RANDOM );

        BubbleSort bubbleSortAscending = new BubbleSort( 100000, BubbleSort.ASCENDING );
        BubbleSort quickSortAscending = new BubbleSort( 100000, BubbleSort.ASCENDING );

        BubbleSort bubbleSortDescending = new BubbleSort( 100000, BubbleSort.DESCENDING );
        BubbleSort quickSortDescending = new BubbleSort( 100000, BubbleSort.DESCENDING );


        bubbleSort.bubbleSortv3();
        long newTime = System.currentTimeMillis();
        System.out.println("\nbubblesort total time: " + (newTime - time) + "ms");

        bubbleSortAscending.bubbleSortv3();
        long newTime2 = System.currentTimeMillis();
        System.out.println("\nbubblesort ascending total time: " + (newTime2 - newTime) + "ms");

        bubbleSortDescending.bubbleSortv3();
        long newTime3 = System.currentTimeMillis();
        System.out.println("\nbubblesort descending total time: " + (newTime3 - newTime2) + "ms");

        quickSort.quickSort();
        long newTime4 = System.currentTimeMillis();
        System.out.println("\n\nquicksort total time: " + (newTime4 - newTime3) + "ms");

        quickSortAscending.quickSort();
        long newTime5 = System.currentTimeMillis();
        System.out.println("\nquicksort ascending total time: " + (newTime5 - newTime4) + "ms");

        quickSortDescending.quickSort();
        long newTime6 = System.currentTimeMillis();
        System.out.println("\nquicksort descending total time: " + (newTime6 - newTime5) + "ms");

   } 
}
