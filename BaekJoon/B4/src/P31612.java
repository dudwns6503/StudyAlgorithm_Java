/*
 * BOJ 31612 画数数え (Stroke Count)
 *
 * memory : 14204kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31612 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'o')
                ans++;
            else
                ans += 2;
        }

        System.out.print(ans);
    }
}
