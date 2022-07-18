/*
 * BOJ 1916 최소비용 구하기
 *
 * memory : 51588kb
 * time : 532ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1916 {

    static FastReader fr = new FastReader();

    static class Bus implements Comparable<Bus> {

        int index;
        int fee;

        public Bus(int index, int fee) {
            this.index = index;
            this.fee = fee;
        }

        @Override
        public int compareTo(Bus other) {
            return this.fee - other.fee;
        }
    }

    static ArrayList<Bus>[] town;
    static int[] d;
    static final int INF = Integer.MAX_VALUE;
    static int N, M, start, end;

    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();

        d = new int[N+1];
        Arrays.fill(d, INF);

        town = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            town[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            int from = fr.nextInt();
            int to = fr.nextInt();
            int fee = fr.nextInt();

            town[from].add(new Bus(to, fee));
        }

        start = fr.nextInt();
        end = fr.nextInt();
    }

    static void dijkstra(int start) {

        PriorityQueue<Bus> pq = new PriorityQueue<>();

        pq.offer(new Bus(start, 0));
        d[start] = 0;

        while(!pq.isEmpty()) {
            Bus bus = pq.poll();

            int now = bus.index;
            int fee = bus.fee;

            if(d[now] < fee) continue;

            for(Bus x: town[now]) {
                int cost = d[now] + x.fee;

                if(cost < d[x.index]) {
                    d[x.index] = cost;
                    pq.offer(new Bus(x.index, cost));
                }
            }
        }
    }

    static void pro() {

        dijkstra(start);

        System.out.print(d[end]);
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
