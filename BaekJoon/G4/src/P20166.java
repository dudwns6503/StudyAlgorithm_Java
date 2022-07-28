/*
 * BOJ 20166 문자열 지옥에 빠진 호석
 *
 * memory : 68740kb
 * time : 716ms
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P20166 {

    static FastReader fr = new FastReader();

    static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    static String[] a;
    static String[] god;
    static int N, M, K;

    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();
        K = fr.nextInt();

        a = new String[N];
        god = new String[K];

        for(int i=0; i<N; i++) {
            a[i] = fr.nextLine();
        }

        for(int i=0; i<K; i++) {
            god[i] = fr.nextLine();
        }
    }

    static void pro() {

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                dfs(i, j, Character.toString(a[i].charAt(j)), 1);
            }
        }

        for(int i=0; i<K; i++) {
            if(hashMap.containsKey(god[i])) System.out.println(hashMap.get(god[i]));
            else System.out.println(0);
        }
    }

    static void dfs(int x, int y, String str, int len) {

        if(hashMap.containsKey(str)) hashMap.put(str, hashMap.get(str) + 1);
        else hashMap.put(str, 1);

        if(len == 5) return;

        for(int k=0; k<8; k++) {
            int nx = (x + dir[k][0]) % N;
            int ny = (y + dir[k][1]) % M;

            if(nx < 0) nx += N;
            if(ny < 0) ny += M;

            dfs(nx, ny, str + a[nx].charAt(ny), len+1);
        }
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
