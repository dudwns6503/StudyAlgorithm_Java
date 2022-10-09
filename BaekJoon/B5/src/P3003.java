/**
 * BOJ 3003 킹, 퀸, 룩, 비숍, 나이트, 폰
 *
 * memory : 14168kb
 * time : 128ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3003 {

    static StringBuilder sb = new StringBuilder();
    static int[] find = new int[6];

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<6; i++) {
            int N = Integer.parseInt(st.nextToken());
            find[i] = N;
        }
    }

    private static void solve() {
        int[] chess = {1, 1, 2, 2, 2, 8};

        for(int i=0; i<chess.length; i++) {
            find[i] = chess[i] - find[i];
            sb.append(find[i]).append(" ");
        }

        System.out.print(sb);
    }
}
