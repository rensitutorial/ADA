import java.util.Random;

public class pr5 {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int size = 100000;
        int[] data = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(100000);
        }

        long startTime = System.nanoTime();

        quickSort(data, 0, data.length - 1);

        long endTime = System.nanoTime();

        double executionTime = (endTime - startTime) / 1000000.0;

        System.out.println("Execution Time: " + executionTime + " ms");
    }
}
