public class TaskA1 {
    public static void heapSortTrace(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        if (n > 1) {
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
            heapify(arr, n - 1, 0);
            System.out.println("State after first 'extract-max' operation: " + arr.toString());
        }
    }

}
