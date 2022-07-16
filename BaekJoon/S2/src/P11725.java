/*
 * BOJ 11725 트리의 부모 찾기
 *
 * memory : 69080kb
 * time : 796ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11725 {

    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] graph;
    static int[] parent;
    static int N;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        parent = new int[N + 1];

        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph[from].add(to);
            graph[to].add(from);
        }
    }

    static void dfs(int x, int par) {

        for(int y: graph[x]) {
            if(y == par) continue;
            parent[y] = x;
            dfs(y, x);
        }
    }

    static void pro() {

        dfs(1, -1);

        for(int i=2; i<=N; i++) {
            sb.append(parent[i]).append("\n");
        }

        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
