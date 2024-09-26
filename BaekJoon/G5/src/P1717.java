/*
 * BOJ 1717 집합의 표현
 *
 * memory : 52708kb
 * time : 420ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1717 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] parents;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int order = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (order == 0)
                union(a, b);
            else {
                if (isSameRoot(a, b)) {
                    sb.append("YES");
                }
                else {
                    sb.append("NO");
                }

                sb.append("\n");
            }
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static boolean isSameRoot(int a, int b) {
        return find(a) == find(b);
    }

    private static void union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);

        if (aRoot == bRoot)
            return;

        if (aRoot > bRoot) {
            parents[aRoot] = bRoot;
        }
        else {
            parents[bRoot] = aRoot;
        }
    }

    private static int find(int x) {
        if (x != parents[x])
            return parents[x] = find(parents[x]);

        return x;
    }
}
