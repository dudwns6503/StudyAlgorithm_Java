/*
 * BOJ 27213 Граничные клетки
 *
 * memory : 14176kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27213 {

    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        long ans = 0;
        if (m == 1 || n == 1)
            ans = Math.max(m, n);
        else if (m == 2 || n == 2) {
            ans = Math.max(m, n) * 2;
        } else {
            ans = ((long)m * n) - ((long) (m - 2) * (n - 2));
        }

        System.out.print(ans);
    }
}
