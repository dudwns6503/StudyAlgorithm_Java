/*
 * BOJ 1976 여행 가자
 *
 * memory : 16696kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1976 {

    private static int[] plannedCity;
    private static int[] parents;
    private static int n;
    private static int m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int root = 0;
        if (m > 0)
            root = find(plannedCity[0]);

        for (int i = 1; i < m; i++) {
            if (root != find(plannedCity[i])) {
                System.out.print("NO");
                return;
            }

        }

        System.out.print("YES");
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        plannedCity = new int[m];
        parents = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                int x = Integer.parseInt(st.nextToken());

                if (i == j)
                    continue;

                if (x == 1)
                    union(i, j);
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            plannedCity[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);

        if (aRoot == bRoot)
            return;

        if (aRoot > bRoot)
            parents[aRoot] = bRoot;
        else
            parents[bRoot] = aRoot;
    }

    private static int find(int x) {
        if (x != parents[x])
            return parents[x] = find(parents[x]);

        return x;
    }
}
