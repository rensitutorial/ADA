import java.util.Random;

public class pr2 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int size = 10000;
        int[] data = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(100000);
        }

        long startTime = System.nanoTime();

        bubbleSort(data);

        long endTime = System.nanoTime();

        double executionTime = (endTime - startTime) / 1000000.0;

        System.out.println("Execution Time: " + executionTime + " ms");
    }
}
