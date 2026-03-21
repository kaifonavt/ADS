void main() {
    Scanner scan = new Scanner(System.in);
    int n= 0;
    int b = 0;
    //test1
    System.out.println("Test 1");
    //
    n = scan.nextInt();
    System.out.println("Sum of squares(n="+ n +"): " + Recursion.sumOfNSquares(n));
    //test2
    System.out.println("Test 2");
    //
    n = scan.nextInt();
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16, 99};
    System.out.println("Sum of array elements(n=" + n + "): " + Recursion.sumOfNArrayElements(arr, n));
    //test3
    System.out.println("Test 3");
    n = scan.nextInt();
    System.out.println("Sum of positive ints(n=" + n + "):"+ Recursion.sumOfN(n));
    //test4
    System.out.println("Test 4");
    b = scan.nextInt();
    n = scan.nextInt();
    System.out.println("Sum of n powers of b(n=" + n + "b=" + b + "):"+ Recursion.sumOfNPowersOfB(b,n));
    //test5
    System.out.println("Test 5");
    Recursion.reverseNElemnts(n, scan);
    n = scan.nextInt();
    scan.close();
    //test6
    System.out.println("Test 6");
    n = scan.nextInt();
    Recursion.reverseNLines(n, scan);
    scan.close();
    //test7

    //test10
    System.out.println("Test 10");
    n  = scan.nextInt();
    Recursion.powerOf2(n);
}
