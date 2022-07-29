/*
 * BOJ 21278 호석이 두 마리 치킨
 *
 * memory : 20008kb
 * time : 276ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P21278 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] con;
    static int[][] D;
    static int N, M;

    static void input() {
        N = fr.nextInt(); M = fr.nextInt();

        con = new ArrayList[N+1];
        D = new int[N+1][N+1];

        for(int i=1; i<=N; i++) {
            con[i] = new ArrayList<>();
        }

        for(int i=1; i<=M; i++) {
            int from = fr.nextInt(); int to = fr.nextInt();

            con[from].add(to);
            con[to].add(from);
        }
    }

    static void bfs(int S) {
        for(int i=1; i<=N; i++) D[S][i] = -1;

        Queue<Integer> q = new LinkedList<>();

        q.add(S);
        D[S][S] = 0;

        while(!q.isEmpty()) {
            int x = q.poll();

            for(int y: con[x]) {
                if(D[S][y] == -1) {
                    D[S][y] = D[S][x] + 1;
                    q.add(y);
                }
            }
        }
    }

    static void pro() {

        for(int i=1; i<=N; i++) bfs(i);

        int ans = Integer.MAX_VALUE;
        int ans_x = 0, ans_y = 0;

        for(int i=1; i<=N; i++) {
            for(int j=i+1; j<=N; j++) {
                int cnt = 0;
                for(int k=1; k<=N; k++) {
                    cnt += Math.min(D[k][i], D[k][j]);
                }
                if(ans > cnt) {
                    ans = cnt;
                    ans_x = i;
                    ans_y = j;
                }
            }
        }

        sb.append(ans_x).append(' ').append(ans_y).append(' ').append(ans*2);
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
