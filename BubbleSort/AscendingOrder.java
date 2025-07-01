package BubbleSort;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] ages = { 21, 18, 25, 19, 22 };
        bubbleSortAscending(ages);

        System.out.print("Sorted ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int counter1 = 0; counter1 < n - 1; counter1++) {
            for (int counter2 = 0; counter2 < n - 1 - counter1; counter2++) {
                if (arr[counter2] > arr[counter2 + 1]) {
                    int temp = arr[counter2];
                    arr[counter2] = arr[counter2 + 1];
                    arr[counter2 + 1] = temp;
                }
            }
        }
    }
}
