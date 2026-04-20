public class TaskB2 {
    public static void hashTable(int[] arr, int size) {
        Integer[] table = new Integer[size];
        for (int key : arr) {
            int hash = key % size;
            int index = hash;
            int i = 0;
            while (table[index] != null) {
                System.out.println("Collision. " + key + " at " + index);
                index = (hash + ++i) % size;
            }
            table[index] = key;
            System.out.println("Inserted " + key + " at " + index);
        }
        System.out.println("Hash Table " + table.toString());
    }
}
