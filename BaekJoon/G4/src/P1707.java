/*
 * BOJ 1707 이분 그래프
 *
 * memory : 272692kb
 * time : 1012ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1707 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static final int RED = 1;
    static final int BLUE = -1;

    static ArrayList<Integer>[] graph;
    static int[] colors;
    static boolean isBipartiteGraph;
    static int V, E;

    static void input() throws Exception {

        st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        graph = new ArrayList[V+1];
        colors = new int[V+1];
        isBipartiteGraph = true;

        for(int i=1; i<=V; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph[from].add(to);
            graph[to].add(from);
        }
    }

    static void bfs(int start, int color) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        colors[start] = color;

        while(!q.isEmpty()) {
            int x = q.poll();

            for(int y: graph[x]) {
                if(colors[y] == 0) {
                    colors[y] = colors[x]*(-1);
                    q.offer(y);
                }
                else if (colors[y] + colors[x] != 0) {
                    isBipartiteGraph = false;
                    return;
                }
            }
        }
    }

    static void pro() {

        for(int i=1; i<=V; i++) {
            if(!isBipartiteGraph) break;

            if(colors[i] == 0)
                bfs(i, RED);
        }

        System.out.println(isBipartiteGraph ? "YES" : "NO");
    }

    public static void main(String[] args) throws Exception {

        int K = Integer.parseInt(br.readLine());

        while(K-- > 0) {
            input();
            pro();
        }
    }
}