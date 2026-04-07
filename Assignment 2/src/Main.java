void main() {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    //task1 - Array List - O(N)
    System.out.println("Test 1");
    int[] test1 = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(Task1.findMajorityElement(test1));
    //task2 - Linked List - O(n)
    System.out.println("Test 1");
    LinkedList test2 = new LinkedList();
    n = scan.nextInt();
    for (int i = 0; i < n ; i++){
        test2.add(i);
    }
    System.out.println(Task2.findMiddle(test2));
    //task3 - Stack
    Stack<Integer> test3 = new Stack<>();
    test3.push(34);
    test3.push(3);
    test3.push(31);
    test3.push(98);
    test3.push(92);
    test3.push(23);
    Task3.sortStack(test3);
    while (!test3.isEmpty()) {
        System.out.print(test3.pop() + " ");
    }
    //task4 - Queue
    Task4 test4 = new Task4();
    test4.push(10);
    test4.push(20);
    test4.push(30);
    System.out.println("Top element: " + test4.top());
    System.out.println("Popped: " + test4.pop());
    System.out.println("New top: " + test4.top());
    //task5 - Hash Table - O(n)
    String test5a = scan.next();
    String test5b = scan.next();
    System.out.println(Task5.isIsomorphic(test5a, test5b));
    //task6 - BST - O(n)
    //task7 - Heap -O(NlogK)
}