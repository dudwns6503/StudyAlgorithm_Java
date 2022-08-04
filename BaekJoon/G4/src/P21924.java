/*
 * BOJ 21924 도시 건설
 *
 * memory : 167880kb
 * time : 1240ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P21924 {

    static class Edge implements Comparable<Edge> {
        int a, b, cost;

        public Edge(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge other) {
            return this.cost - other.cost;
        }
    }

    static FastReader fr = new FastReader();

    static ArrayList<Edge> edges = new ArrayList<>();
    static int[] parents;
    static int N, M, count;
    static long max_sum;

    static void input() {
        N = fr.nextInt();
        M = fr.nextInt();

        parents = new int[N+1];
        max_sum = 0;
        for(int i=1; i<=M; i++) {
            int a = fr.nextInt();
            int b = fr.nextInt();
            int c = fr.nextInt();

            max_sum += c;
            edges.add(new Edge(a, b, c));
        }

        Collections.sort(edges);
    }

    static void pro() {
        for(int i=1; i<=N; i++) {
            parents[i] = i;
        }

        for(int i=0; i<edges.size(); i++) {
            int a = edges.get(i).a;
            int b = edges.get(i).b;
            int cost = edges.get(i).cost;

            // 사이클이 발생하지 않는다면..
            if(find_parent(a) != find_parent(b)) {
                union_parent(a, b);
                max_sum -= cost;
                count++;
            }
        }

        if(count != N-1) System.out.print(-1);
        else System.out.print(max_sum);
    }

    static int find_parent(int x) {
        if(x == parents[x]) return x;
        return parents[x] = find_parent(parents[x]);
    }

    static void union_parent(int a, int b) {
        a = find_parent(a);
        b = find_parent(b);
        if(a < b) parents[b] = a;
        else parents[a] = b;
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
