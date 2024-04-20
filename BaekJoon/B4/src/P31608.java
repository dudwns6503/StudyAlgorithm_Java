/*
 * BOJ 31608 ハミング距離 (Hamming Distance)
 *
 * memory : 14188kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31608 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        String t = br.readLine();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i))
                ans++;
        }

        System.out.print(ans);
    }
}
