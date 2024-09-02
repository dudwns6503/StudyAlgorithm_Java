/*
 * BOJ 10451 순열 사이클
 *
 * memory : 100340kb
 * time : 572ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P10451 {

    private static StringBuilder sb = new StringBuilder();
    private static ArrayList<Integer>[] graph;
    private static boolean[] visited;
    private static int n, size;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve() {
        size = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                size++;
            }
        }

        sb.append(size).append("\n");
    }

    private static void dfs(int x) {
        visited[x] = true;

        for (int y : graph[x]) {
            if (visited[y])
                continue;

            dfs(y);
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            visited = new boolean[n + 1];
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int pi = Integer.parseInt(st.nextToken());
                graph[i].add(pi);
            }

            solve();
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
