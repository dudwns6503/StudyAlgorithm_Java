/*
 * BOJ 25625 샤틀버스
 *
 * memory : 14060kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25625 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int ans = x + y;
        if (y > x)
            ans = Math.min(ans, y - x);

        System.out.print(ans);
    }
}
