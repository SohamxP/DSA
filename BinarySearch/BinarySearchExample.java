public class BinarySearchExample {

    public static void main(String[] args) {
        // Define a sorted array and the target value
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int target = 50;

        // Perform the binary search
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
            boolean multiple = hasMultipleOccurrences(arr, target);
            System.out.println("Has Multiple Occurrences: " + multiple);

        } else {
            System.out.println("Element not found.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return index
            }

            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    // Method to check if the target has multiple occurrences in the sorted array
    public static boolean hasMultipleOccurrences(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                int leftIndex = mid - 1;
                while (leftIndex >= 0 && arr[leftIndex] == target) {
                    return true;
                }

                int rightIndex = mid + 1;
                while (rightIndex < arr.length && arr[rightIndex] == target) {
                    return true;
                }

                return false;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

}
