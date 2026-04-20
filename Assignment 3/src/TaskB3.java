public class TaskB3 {
    public static int[] findMaxMinSimple(int[] arr, int low, int high) {
        if (low == high) {
            return new int[]{arr[low], arr[low]};
        }
        if (high == low + 1) {
            int max = Math.max(arr[low], arr[high]);
            int min = Math.min(arr[low], arr[high]);
            return new int[]{max, min};
        }
        int mid = (low + high) / 2;
        int[] leftRes = findMaxMinSimple(arr, low, mid);
        int[] rightRes = findMaxMinSimple(arr, mid + 1, high);
        int finalMax = Math.max(leftRes[0], rightRes[0]);
        int finalMin = Math.min(leftRes[1], rightRes[1]);
        System.out.println(" Max " + finalMax + ", Min " + finalMin);
        return new int[]{finalMax, finalMin};
    }
}
