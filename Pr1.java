import java.util.*;

class SelectionSort {
    public static void main(String args[]) {
        int n = 5000;
        int a[] = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10000);
        }

        long start = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " nanoseconds");
    }
}
