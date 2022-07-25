/*
 * BOJ 10870 피보나치 수 5
 *
 * memory : 17664kb
 * time : 212ms
 */

import java.util.Scanner;

public class P10870 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(fibonacci(N));
    }

    static int fibonacci(int n) {

        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
