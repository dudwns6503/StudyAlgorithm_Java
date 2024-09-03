/*
 * BOJ 9466 텀 프로젝트
 *
 * memory : 298456kb
 * time : 908ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9466 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] students;
    private static boolean[] visited;
    private static boolean[] finished;
    private static int n, count;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve() {
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        sb.append(n - count).append("\n");
    }

    private static void dfs(int x) {
        visited[x] = true;

        int next = students[x];

        if (!visited[next]) {
            dfs(next);
        } else if (!finished[next]) { // 방문했지만 처리가 끝나지 않았다면 사이클이 존재.
            count++;
            for (int i = next; i != x; i = students[i]) {
                count++;
            }
        }

        finished[x] = true;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            students = new int[n + 1];
            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            count = 0;

            for (int i = 1; i <= n; i++) {
                students[i] = Integer.parseInt(st.nextToken());
            }

            solve();
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
