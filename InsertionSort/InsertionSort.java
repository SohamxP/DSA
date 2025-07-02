package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        String[] names = { "Augusta", "Ria", "Jodee", "Sophia", "James" };
        System.out.print("Original names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        insertionSortAscending(names);
        System.out.print("Sorted names in ascending order: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        insertionSortDescending(names);
        System.out.print("Sorted names in reverse order: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    public static void insertionSortAscending(String[] arr) {
        int n = arr.length;
        for (int counter1 = 1; counter1 < n; counter1++) {
            String key = arr[counter1];
            int counter2 = counter1 - 1;
            while (counter2 >= 0 && arr[counter2].compareTo(key) > 0) {
                arr[counter2 + 1] = arr[counter2];
                counter2 = counter2 - 1;
            }
            arr[counter2 + 1] = key;
        }
    }

    public static void insertionSortDescending(String[] arr) {
        int n = arr.length;
        for (int counter1 = 1; counter1 < n; counter1++) {
            String key = arr[counter1];
            int counter2 = counter1 - 1;
            while (counter2 >= 0 && arr[counter2].compareTo(key) < 0) {
                arr[counter2 + 1] = arr[counter2];
                counter2 = counter2 - 1;
            }
            arr[counter2 + 1] = key;
        }
    }
}
