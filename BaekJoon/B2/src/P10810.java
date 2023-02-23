/*
 * BOJ 10810 공 넣기
 *
 * memory : 14336kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10810 {

    private static int[] buckets;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        buckets = new int[n + 1];

        for (int z = 0; z < m; z++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            solve(i, j, k);
        }

        for (int i = 1; i <= n; i++) {
            sb.append(buckets[i]).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void solve(int i, int j, int k) {
        for (int z = i; z <= j; z++) {
            buckets[z] = k;
        }
    }
}
