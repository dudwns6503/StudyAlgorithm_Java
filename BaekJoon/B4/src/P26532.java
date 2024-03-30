/*
 * BOJ 26532 Acres
 *
 * memory : 14208kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26532 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int div = 4840 * 5;

        int ans = (a * b) / div;

        if ((a * b) % div != 0)
            ans++;

        System.out.print(ans);
    }
}
