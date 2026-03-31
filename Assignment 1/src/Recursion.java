import java.util.Scanner;

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
        if (n == 0) return 1;
        return power(b, n) + sumOfNPowersOfB(b, n-1 );
    }
    //task5
    public static void reverseNElemnts(int n, Scanner scan) {
        if (n == 0) return;
        int x = scan.nextInt();
        reverseNElemnts(n - 1, scan);
        System.out.print(x + " ");
    }
    //task6
    public static void reverseNLines(int n, Scanner scan){
        if (n == 0) return;
        char[] str = scan.nextLine().toCharArray();
        reverseNLines(n - 1, scan);
        System.out.println(str);
    }
    //task7
    public static void spiralN(int[][] matrix, int top, int bottom, int left, int right, int n) {
        if ((top > bottom) || (left > right)) return;
        for (int c = left; c <= right; c++)
            matrix[top][c] = n++;
        for (int r = top + 1; r <= bottom; r++)
            matrix[r][right] = n++;
        if (top < bottom)
            for (int c = right - 1; c >= left; c--)
                matrix[bottom][c] = n++;
        if (left < right)
            for (int r = bottom - 1; r >= top + 1; r--)
                matrix[r][left] = n++;
        spiralN(matrix, top + 1, bottom - 1, left + 1, right - 1, n);
    }
    //task8
    static void sequenceNK(int[] arr, int pos, int n, int k) {
        if (pos == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
            return;
        }
        for (int x = 1; x <= k; x++) {
            arr[pos] = x;
            sequenceNK(arr, pos + 1, n, k);
        }
    }
    //tsk9
    static void permute(char[] arr, int start) {
        if (start == arr.length) {
            System.out.println(new String(arr));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            char temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            permute(arr, start + 1);
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
        }
    }
    //task10
    public static boolean powerOf2(int n) {
        if  (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 == 1) return false;
        return powerOf2(n / 2);
    }
    //aditional funcs
    public static int power(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        return a*power(a, b-1);
    }
}
