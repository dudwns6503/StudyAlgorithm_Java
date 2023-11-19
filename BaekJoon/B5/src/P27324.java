/*
 * BOJ 27324 ゾロ目 (Same Numbers)
 *
 * memory : 14216kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27324 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n / 10 == n % 10)
            System.out.print("1");
        else
            System.out.print("0");
    }
}
