public class QuickSort {

    // Method to perform QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot element using two-pointer technique (i and j)
            int pivotIndex = partition(array, low, high);

            // Recursively sort the elements on the left of the pivot
            quickSort(array, low, pivotIndex - 1);

            // Recursively sort the elements on the right of the pivot
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Method to partition the array using i and j pointers
    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];  // Choose the first element as the pivot
        int i = low;
        int j = high;

        while (i < j) {
            // Move the j pointer leftwards until an element smaller than the pivot is found
            while (i < j && array[j] >= pivot) {
                j--;
            }

            // Move the i pointer rightwards until an element greater than the pivot is found
            while (i < j && array[i] <= pivot) {
                i++;
            }

            // Swap elements at the i and j pointers
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Place the pivot in its correct position
        array[low] = array[i];
        array[i] = pivot;

        // Return the pivot index
        return i;
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the QuickSort algorithm
    public static void main(String[] args) {
        int[] array = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}
