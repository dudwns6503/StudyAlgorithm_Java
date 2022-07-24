/*
 * BOJ 24480 알고리즘 수업 - 깊이 우선 탐색2
 *
 * memory : 90912kb
 * time : 952ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P24480 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] graph;
    static int[] count;
    static int N, M, R, cnt;

    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();
        R = fr.nextInt();

        graph = new ArrayList[N+1];

        // 정점의 방문 순서를 저장할 배열.
        count = new int[N+1];

        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            int from = fr.nextInt();
            int to = fr.nextInt();

            graph[from].add(to);
            graph[to].add(from);
        }

        // 인접 정점은 내림차순으로 방문한다는 조건으로 인하여 정렬.
        for(int i=1; i<=N; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }
    }

    static void dfs(int start) {

        // dfs에 들어오면 cnt++ 해주고 현재 노드의 방문순서를 count배열에 저장한다.
        cnt++;
        count[start] = cnt;

        // 현재 노드와 연결된 노드를 내림차순으로 확인하고, 방문한 적이 없다면 재귀적으로 dfs 수행.
        for(int y: graph[start]) {
            if(count[y] != 0) continue;

            dfs(y);
        }
    }
    static void pro() {

        dfs(R);

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

