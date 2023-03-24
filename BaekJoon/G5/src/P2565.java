/*
 * BOJ 2565 전깃줄
 *
 * memory : 14276kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2565 {

    private static Node[] nodes;
    private static int[] dp;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        nodes = new Node[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            nodes[i] = new Node(a, b);
        }
    }

    private static void solve() {
        Arrays.sort(nodes, (c1, c2) -> c1.a - c2.a);

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, recur(i));
        }

        System.out.print(n - max);
    }

    private static int recur(int cur) {
        if (dp[cur] < 1) {
            dp[cur] = 1;

            for (int i = cur + 1; i < n; i++) {
                if (nodes[cur].b < nodes[i].b) {
                    dp[cur] = Math.max(dp[cur], recur(i) + 1);
                }
            }
        }

        return dp[cur];
    }


    static class Node {
        int a, b;

        public Node(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
