/*
 * BOJ 11724 연결 요소의 개수
 *
 * memory : 141388kb
 * time : 644ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11724 {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int N, M, ans;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }
    }

    static void bfs(int start) {

        Queue<Integer> que = new LinkedList<>();

        que.add(start);
        visited[start] = true;

        while(!que.isEmpty()) {
            int x = que.poll();

            for(int y: graph[x]) {
                if(visited[y]) continue;

                que.add(y);
                visited[y] = true;
            }
        }

    }

    static void pro() {

        ans = 0;

        // 이미 방문했다는 것은 이미 이전 노드에서 하나로 이어진 노드라는 뜻이므로 continue
        for(int i=1; i<=N; i++) {
            if(visited[i]) continue;

            bfs(i);
            ans++;
        }

        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
