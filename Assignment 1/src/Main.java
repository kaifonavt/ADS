void main() {
    Scanner scan = new Scanner(System.in);
    int n= 0;
    int b = 0;
    //test1
    //
    n = scan.nextInt();
    System.out.println("Sum of squares(n="+ n +"): " + Recursion.sumOfNSquares(n));
    //test2
    n = scan.nextInt();
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16, 99};
    System.out.println("Sum of array elements(n=" + n + "): " + Recursion.sumOfNArrayElements(arr, n));
    //test3
    n = scan.nextInt();
    System.out.println("Sum of positive ints(n=" + n + "):"+ Recursion.sumOfN(n));
    //test4
    b = scan.nextInt();
    n = scan.nextInt();
    System.out.println("Sum of n powers of b(n=" + n + "b=" + b + "):"+ Recursion.sumOfNPowersOfB(b,n));
    //test5
    Recursion.reverseNElemnts(n, scan);
    n = scan.nextInt();
    scan.close();
    //test6
    n = scan.nextInt();
    Recursion.reverseNLines(n, scan);
    scan.close();
    //test7

}
