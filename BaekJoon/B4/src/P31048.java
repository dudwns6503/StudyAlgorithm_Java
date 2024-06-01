/*
 * BOJ 31048 Last Factorial Digit
 *
 * memory : 13992kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31048 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int factorial = 1;
            for (int j = 1; j <= n; j++) {
                factorial *= j;
            }

            System.out.println(factorial % 10);
        }
    }
}
