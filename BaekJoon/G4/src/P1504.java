/*
 * BOJ 1504 특정한 최단 경로
 *
 * memory : 68620kb
 * time : 724ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1504 {

    static FastReader fr = new FastReader();

    static class Node implements Comparable<Node> {

        int index, distance;
        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return this.distance - other.distance;
        }
    }

    static ArrayList<Node>[] graph;
    static int[] d;
    static final int INF = (int) 2e8;
    static int N, E, v1, v2;

    static void input() {

        N = fr.nextInt();
        E = fr.nextInt();

        d = new int[N + 1];

        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<E; i++) {
            int a = fr.nextInt();
            int b = fr.nextInt();
            int dist = fr.nextInt();

            graph[a].add(new Node(b, dist));
            graph[b].add(new Node(a, dist));
        }

        v1 = fr.nextInt();
        v2 = fr.nextInt();
    }

    static int dijkstra(int start, int end) {

        PriorityQueue<Node> pq = new PriorityQueue<>();
        Arrays.fill(d, INF);

        pq.offer(new Node(start, 0));
        d[start] = 0;

        while(!pq.isEmpty()) {
            Node node = pq.poll();

            int now = node.index;
            int dist = node.distance;

            if(d[now] < dist) continue;

            for(Node y: graph[now]) {
               if(d[y.index] > d[now] + y.distance) {
                   d[y.index] = d[now] + y.distance;
                   pq.offer(new Node(y.index, d[y.index]));
               }
            }
        }
        return d[end];
    }

    static void pro() {

        int result1 = 0;
        int result2 = 0;

        result1 += dijkstra(1, v1);
        result1 += dijkstra(v1, v2);
        result1 += dijkstra(v2, N);

        result2 += dijkstra(1, v2);
        result2 += dijkstra(v2, v1);
        result2 += dijkstra(v1, N);

        int ans = (result1 >= INF && result2 >= INF) ? -1 : Math.min(result1, result2);
        System.out.print(ans);
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