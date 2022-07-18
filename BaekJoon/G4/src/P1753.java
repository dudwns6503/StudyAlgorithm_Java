/*
 * BOJ 1753 최단경로
 *
 * memory : 109444kb
 * time : 732ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1753 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static class Node implements Comparable<Node> {

        int index;
        int weight;

        public Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return this.weight - other.weight;
        }
    }

    static final int INF = (int) 1e9;
    static ArrayList<Node>[] graph;
    static int[] d;
    static int V, E, start;

    static void input() {

        V = fr.nextInt();
        E = fr.nextInt();

        start = fr.nextInt();

        d = new int[V + 1];
        graph = new ArrayList[V + 1];
        for(int i=1; i<=V; i++) {
            graph[i] = new ArrayList<>();
        }

        Arrays.fill(d, INF);

        for(int i=0; i<E; i++) {
            int from = fr.nextInt();
            int to = fr.nextInt();
            int weight = fr.nextInt();

            graph[from].add(new Node(to, weight));
        }
    }

    static void dijkstra(int start) {

        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(start, 0));
        d[start] = 0;

        while(!pq.isEmpty()) {
            Node node = pq.poll();

            int now = node.index;
            int weight = node.weight;

            // 현재 now까지의 최단 경로보다 크다면 가치가 없는 정보이므로 넘어감.
            if(d[now] < weight) continue;

            for(Node y: graph[now]) {
                // now까지의 최단 경로 + 현재 노드까지의 가중치
                int cost = d[now] + y.weight;

                // 현재 노드까지의 최단경로보다 cost가 작다면 갱신해주고 우선순위 큐에 현재 노드와 cost를 넣어준다.
                if(cost < d[y.index]) {
                    d[y.index] = cost;
                    pq.offer(new Node(y.index, cost));
                }
            }
        }
    }

    static void pro() {

        dijkstra(start);

        for(int i=1; i<=V; i++) {
            if(d[i] == INF) sb.append("INF").append("\n");
            else sb.append(d[i]).append("\n");
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
