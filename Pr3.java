import java.util.Random;

public class pr3 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
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

        insertionSort(data);

        long endTime = System.nanoTime();

        double executionTime = (endTime - startTime) / 1000000.0;

        System.out.println("Execution Time: " + executionTime + " ms");
    }
}
