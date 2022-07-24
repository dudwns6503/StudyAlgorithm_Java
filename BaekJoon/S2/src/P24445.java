/*
 * BOJ 24445 알고리즘 수업 - 너비 우선 탐색 2
 *
 * memory : 91908kb
 * time : 992ms
 */

import java.io.*;
import java.util.*;

public class P24445 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] count;
    static int N, M, R, cnt;
    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();
        R = fr.nextInt();

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];
        count = new int[N+1];

        for(int i=1; i<=N; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            int from = fr.nextInt();
            int to = fr.nextInt();

            adj[from].add(to);
            adj[to].add(from);
        }

        for(int i=1; i<=N; i++) {
            Collections.sort(adj[i], Collections.reverseOrder());
        }
    }

    static void bfs(int node) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(node);
        visited[node] = true;

        while(!q.isEmpty()) {
            int x = q.poll();
            count[x] = ++cnt;

            for(int y: adj[x]) {
                if(visited[y] == true) continue;

                q.offer(y);
                visited[y] = true;
            }
        }
    }

    static void pro() {

        bfs(R);

        for(int i=1; i<=N; i++) {
            sb.append(count[i]).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) {

        input();
        pro();
    }

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}