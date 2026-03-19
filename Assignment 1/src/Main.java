void main() {
    int n= 0;
    int b = 0;
    int arr[] = {1,2,3,4,5,6,7,8,9,99};
    //test1
    n = 4;
    System.out.println("Sum of squares(n="+ n +"): " + Recursion.sumOfNSquares(n));
    //test2
    n = 5;
    System.out.println("Sum of array elements(n=" + n + "): " + Recursion.sumOfNArrayElements(arr, n));
    //test3
    n = 7;
    System.out.println("sum of positive ints(n=" + n + "):"+ Recursion.sumOfN(n));
    //test4
    b = 4;
    n = 3;
    System.out.println("sum of n powers of b(n=" + n + "b=" + b + "):"+ Recursion.sumOfNPowersOfB(b,n));
    //test5
}
