public class TaskA3 {
    public static int quickSortPartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                System.out.println("After partition"  + arr.toString());
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println(arr.toString());
        }
    }
}
