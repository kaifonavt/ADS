import java.util.Arrays;

public class TaskA1 {
    private int[] heap;
    private int size;
    public TaskA1(int[] array) {
        this.heap = Arrays.copyOf(array, array.length);
        this.size = array.length;
        buildMaxHeap();
    }
    private void buildMaxHeap() {
        for (int i = (size / 2) - 1; i >= 0; i--) {
            heapify(i);
        }
    }
    private void heapify(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }
    public int extractMax() {
        if (size == 0) throw new IllegalStateException("Heap is empty");

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return max;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }
}
