/*
 * BOJ 28248 Deliv-e-droid
 *
 * memory : 14136kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28248 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int ans = 0;

        if (p > c)
            ans += 500;

        ans += p * 50;
        ans -= 10 * c;

        System.out.print(ans);
    }
}
