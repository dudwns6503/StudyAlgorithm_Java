/*
 * BOJ 20833 Kuber
 *
 * memory : 14024kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20833 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        System.out.print(sum);
    }
}
