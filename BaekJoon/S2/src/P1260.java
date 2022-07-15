/*
 * BOJ 1260 DFS와 BFS(인접행렬 풀이)
 *
 * memory : 23768kb
 * time : 272ms
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260 {

    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static int[][] adj;
    static boolean[] visited;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new int[N+1][N+1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x][y] = 1;
            adj[y][x] = 1;
        }
    }

    static void dfs(int x) {

        visited[x] = true;
        sb.append(x).append(" ");

        for(int y=1; y<=N; y++) {
            if(adj[x][y] == 0) continue;
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

            for(int y=1; y<=N; y++) {
                if(adj[x][y] == 0) continue;
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
