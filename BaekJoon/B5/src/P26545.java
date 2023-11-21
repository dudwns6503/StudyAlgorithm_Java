/*
 * BOJ 26545 Mathematics
 *
 * memory : 14040kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26545 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.print(sum);
    }
}
