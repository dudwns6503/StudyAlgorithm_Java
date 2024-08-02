/*
 * BOJ 30802 웰컴 키트
 *
 * memory : 15988kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30802 {

    private static int[] participants;
    private static int n, t, p;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int tCount = 0;

        for (int i = 0; i < 6; i++) {
            if (participants[i] % t == 0)
                tCount += participants[i] / t;
            else
                tCount += (participants[i] / t) + 1;
        }

        System.out.println(tCount);
        System.out.print(n / p + " " + n % p);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        participants = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            participants[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
    }
}
