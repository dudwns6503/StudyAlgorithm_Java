/*
 * BOJ 15970 화살표 그리기
 *
 * memory : 16676kb
 * time : 160ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P15970 {

    private static Node[] nodes;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        Arrays.sort(nodes);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int prev = i - 1;
            int next = i + 1;

            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            if (prev >= 0) {
                if (nodes[prev].color == nodes[i].color)
                    left = nodes[i].x - nodes[prev].x;
            }
            if (next < n) {
                if (nodes[next].color == nodes[i].color)
                    right = nodes[next].x - nodes[i].x;
            }

            if (left == Integer.MAX_VALUE && right == Integer.MAX_VALUE)
                continue;

            ans += Math.min(left, right);
        }

        System.out.print(ans);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());
            nodes[i] = new Node(x, color);
        }
    }

    static class Node implements Comparable<Node> {
        int x;
        int color;

        public Node(int x, int color) {
            this.x = x;
            this.color = color;
        }

        @Override
        public int compareTo(Node o) {
            if (this.color == o.color)
                return this.x - o.x;

            return this.color - o.color;
        }
    }
}
