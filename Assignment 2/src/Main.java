void main() {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    //task1 - dynamyc array
    System.out.println("Test 1");
    DynamicArray test1 = new DynamicArray();
    n = scan.nextInt();
    for (int i = 0; i < n ; i++){
        test1.add(i);
    }
    //test2 - Reverse Linked List
    LinkedList test2 = new LinkedList();
    n = scan.nextInt();
    for (int i = 0; i < n ; i++){
        test2.add(i);
    }
    test2.printReverse();
    //test3 - Cycle Detection
    LinkedList test3 = new LinkedList();
    System.out.println(test3.detectCycle());
    //test5 - Balanced Brackets
    System.out.println("Test 5");
    BracketsString test5 = new BracketsString(scan.nextLine());
    System.out.println(test5.BalancedBrackets());
}