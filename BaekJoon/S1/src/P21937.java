/*
 * BOJ 21937 작업
 *
 * memory : 71476kb
 * time : 556ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P21937 {

    static FastReader fr = new FastReader();

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int N, M, X, ans;

    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i=1; i<=N; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i=1; i<=M; i++) {
            int A = fr.nextInt();
            int B = fr.nextInt();

            adj[B].add(A);
        }

        X = fr.nextInt();
    }

    static void sol() {
       dfs(X);
       System.out.println(ans);
    }

    static void dfs(int x) {

        visited[x] = true;

        for(int y: adj[x]) {
            if(visited[y]) continue;

            ans++;
            dfs(y);
        }
    }

    public static void main(String[] args) {
        input();
        sol();
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
