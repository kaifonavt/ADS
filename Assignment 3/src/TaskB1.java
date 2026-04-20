public class TaskB1 {
    public static void binarySearch(int[] arr, int target) {
        Additions.QuickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array " + arr.toString());
        int low = 0;
        int high = arr.length - 1;
        int step = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println(low+" "+ high+" "+mid);
            if (arr[mid] == target) {
                System.out.println(target + " at " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}
