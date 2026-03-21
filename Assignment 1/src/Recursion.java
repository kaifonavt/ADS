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
        if (n == 1) return 1;
        return n + power(b, n - 1);
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
        System.out.print(str);
    }
    //task7
    public static void spiralN(int n){

    }
    //task8
    public static void sequenceNK(int n, int k){
        if() return ;


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
    private static int power(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        return a*power(a, b-1);
    }
}
