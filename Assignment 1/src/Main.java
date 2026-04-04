void main() {
    Scanner scan = new Scanner(System.in);
    int n= 0;
    int b = 0;
    int k = 0;
    int[][] matrix;
    //test1//O(n)
    System.out.println("Test 1");
    n = scan.nextInt();
    System.out.println("Sum of squares(n="+ n +"): " + Recursion.sumOfNSquares(n));
    //test2//O(n)
    System.out.println("Test 2");
    n = scan.nextInt();
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16, 99};
    System.out.println("Sum of array elements(n=" + n + "): " + Recursion.sumOfNArrayElements(arr, n));
    //test3//O(n)
    System.out.println("Test 3");
    n = scan.nextInt();
    System.out.println("Sum of positive ints(n=" + n + "):"+ Recursion.sumOfN(n));
    //test4//O(n²)
    System.out.println("Test 4");
    b = scan.nextInt();
    n = scan.nextInt();
    System.out.println("Sum of n powers of b(n=" + n + "b=" + b + "):"+ Recursion.sumOfNPowersOfB(b,n));
    //test5//O(n)
    System.out.println("Test 5");
    n = scan.nextInt();
    Recursion.reverseNElemnts(n, scan);
    scan.close();
    //test6//O(n·L)
    System.out.println("Test 6");
    n = scan.nextInt();
    Recursion.reverseNLines(n, scan);
    scan.close();
    //test7//O(n²)
    System.out.println("Test 7");
    n = scan.nextInt();
    matrix = new int[n][n];
    Recursion.spiralN(matrix,0, n - 1, 0, n - 1, 1);
    for (int r = 0; r < n; r++) {
        for (int c = 0; c < n; c++) {
            if (c > 0) System.out.print(" ");
            System.out.print(matrix[r][c]);
        }
        System.out.println();
    }
    scan.close();
    //test8//O(n·kⁿ)
    System.out.println("Test 8");
    n = scan.nextInt();
    k = scan.nextInt();
    Recursion.sequenceNK(new int[n], 0, n, k);
    scan.close();
    //test9//O(n·n!)
    System.out.println("Test 9");
    char[] symbol = scan.next().toCharArray();
    Recursion.permute(symbol, 0);
    scan.close();
    //test10//O(n)
    System.out.println("Test 10");
    n  = scan.nextInt();
    System.out.println(Recursion.powerOf2(n));
    scan.close();
}