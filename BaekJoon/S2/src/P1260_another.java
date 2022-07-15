/*
 * BOJ 1260 DFS와 BFS(인접리스트 풀이)
 *
 * memory : 20032kb
 * time : 248ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1260_another {

    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];

        for(int i=1; i<=N; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }

        for(int i=1; i<=N; i++) {
            Collections.sort(adj[i]);
        }
    }

    static void dfs(int x) {

        visited[x] = true;
        sb.append(x).append(" ");

        for(int y: adj[x]) {
            if(visited[y] == true) continue;

            dfs(y);
        }
    }

    static void bfs(int x) {

        Queue<Integer> que = new LinkedList<>();

        que.add(x);
        visited[x] = true;

        while(!que.isEmpty()) {
            x = que.poll();
            sb.append(x).append(" ");

            for(int y: adj[x]) {
                if(visited[y] == true) continue;

                que.add(y);
                visited[y] = true;
            }
        }
    }

    static void pro() {

        visited = new boolean[N + 1];
        dfs(V);

        sb.append("\n");

        visited = new boolean[N + 1];
        bfs(V);

        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
