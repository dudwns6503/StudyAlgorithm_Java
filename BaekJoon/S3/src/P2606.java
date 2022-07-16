/*
 * BOJ 2606 바이러스
 *
 * memory : 14208kb
 * time : 128ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2606 {

    static ArrayList<Integer>[] network;
    static boolean[] visited;
    static int N, M, ans;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];

        network = new ArrayList[N + 1];

        for(int i=1; i<=N; i++) {
            network[i] = new ArrayList<Integer>();
        }

        StringTokenizer st;
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            network[from].add(to);
            network[to].add(from);
        }
    }

    static void bfs(int start) {

        Queue<Integer> que = new LinkedList<>();

        que.offer(start);
        visited[start] = true;

        while(!que.isEmpty()) {
            int fromComputer = que.poll();
            ans++;

            for(int toComputer : network[fromComputer]) {
                if(visited[toComputer]) continue;

                que.offer(toComputer);
                visited[toComputer] = true;
            }
        }
    }

    static void pro() {

        bfs(1);
        System.out.print(ans-1);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
