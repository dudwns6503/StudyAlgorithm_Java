/*
 * BOJ 24365 ПЧЕЛИЧКАТА МАЯ
 *
 * memory : 14096kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24365 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int average = (a + b + c) / 3;

        int ans = 0;
        if (a < average) {
            ans += average - a;
            b -= average - a;
        } else if (a > average) {
            ans += a - average;
            b += a - average;
        }

        if (b < average) {
            ans += average - b;
            c -= average - b;
        } else if (b > average) {
            ans += b - average;
            c += b - average;
        }

        if (c < average) {
            ans += average - c;
            b -= average - c;
        } else if (c > average) {
            ans += c - average;
            c += c - average;
        }

        System.out.print(ans);
    }
}
