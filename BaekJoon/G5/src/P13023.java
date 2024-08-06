/*
 * BOJ 13023 ABCDE
 *
 * memory : 22196kb
 * time : 272ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P13023 {

    private static ArrayList<Integer>[] graph;
    private static boolean[] visited;
    private static int n, m, ans;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        ans = 0;

        for (int i = 0; i < n; i++) {
            if (ans == 0)
                dfs(i, 1);
        }

        System.out.print(ans);
    }

    private static void dfs(int k, int len) {
        if (len >= 5) {
            ans = 1;
            return;
        }

        visited[k] = true;

        for (int nextNode : graph[k]) {
            if (visited[nextNode]) continue;

            dfs(nextNode, len + 1);
        }

        visited[k] = false;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }
    }
}
