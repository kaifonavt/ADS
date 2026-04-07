class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 2;
        this.array = new int[capacity];
        this.size = 0;
    }
    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        array[size++] = value;
    }
    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return array[index];
    }
    public int size() { return size; }
}

