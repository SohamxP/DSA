public class Main {
    public static void mergeSort(int[] numbers, int left, int right) {
        if (numbers == null || numbers.length == 0) {
            return; // Handle empty array case
        }
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);

            // Merge the sorted halves
            merge(numbers, left, mid, right);
        }
    }

    private static void merge(int[] numbers, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int sizeOfLeftArray = middle - left + 1;
        int sizeOfRightArray = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[sizeOfLeftArray];
        int[] rightArray = new int[sizeOfRightArray];

        // Copy data to temporary arrays
        for (int index = 0; index < sizeOfLeftArray; index++) {
            leftArray[index] = numbers[left + index];
        }
        for (int index = 0; index < sizeOfRightArray; index++) {
            rightArray[index] = numbers[middle + 1 + index];
        }

        // Merge the temporary arrays
        int indexOfLeftArray = 0, indexOfRightArray = 0;
        int indexOfMergedArray = left;
        while (indexOfLeftArray < sizeOfLeftArray && indexOfRightArray < sizeOfRightArray) {
            if (leftArray[indexOfLeftArray] <= rightArray[indexOfRightArray]) {
                numbers[indexOfMergedArray] = leftArray[indexOfLeftArray];
                indexOfLeftArray++;
            } else {
                numbers[indexOfMergedArray] = rightArray[indexOfRightArray];
                indexOfRightArray++;
            }
            indexOfMergedArray++;
        }

        // Copy remaining elements of leftArray, if any
        while (indexOfLeftArray < sizeOfLeftArray) {
            numbers[indexOfMergedArray] = leftArray[indexOfLeftArray];
            indexOfLeftArray++;
            indexOfMergedArray++;
        }

        // Copy remaining elements of rightArray, if any
        while (indexOfRightArray < sizeOfRightArray) {
            numbers[indexOfMergedArray] = rightArray[indexOfRightArray];
            indexOfRightArray++;
            indexOfMergedArray++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Original array:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println();

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
    }
}