void main() {
    int[] arr = {33, 69, 91, 36, 29, 12, 62, 54, 10, 57};
    //tast A1 - HeapSort - O(n*log(n))
    TaskA1 myHeap = new TaskA1(arr);
    myHeap.printHeap();
    myHeap.extractMax();
    myHeap.printHeap();
    //task A2 - BubbleSortMod - O(n2)
    TaskA2.bubbleSort(arr);
    //Task 3A - QuickSortPartition - O(n*log(n))
    TaskA3.quickSortPartition(arr, 0, arr.length - 1);
    //Task B1 - BinarySearch - O(log(n))
    TaskB1.binarySearch(arr, 12);
    //Task B2 - Hashing - O(n);
    TaskB2.hashTable(arr, 7);
    //Task B3 - MinMax - O(n)
    TaskB3.findMaxMinSimple(arr, 0, arr.length - 1);
}