public class Recursion {
    //task 1
    public static int sumOfNSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumOfNSquares(n - 1);
    }
    //task2
    public static int sumOfNArrayElements(int[] arr, int n) {
        if (n == 1) return arr[0];
        return arr[n - 1] + sumOfNArrayElements(arr, n - 1);
    }
    //ttask3
    public static int sumOfN(int n) {
        if (n == 1) return 1;
        return n + sumOfN(n - 1);
    }
    //task4
    public static int sumOfNPowersOfB(int b, int n) {
        if (n == 1) return 1;
        return n + power(b, n - 1);
    }

    //aditional funcs
    public static int power(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        return a*power(a, b-1);
    }
}
