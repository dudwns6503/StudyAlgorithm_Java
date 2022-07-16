/*
 * BOJ 2252
 *
 * memory : 46128kb
 * time : 476ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2252 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] in_degree;
    static ArrayList<Integer>[] student;
    static int N, M;

    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();

        student = new ArrayList[N+1];
        in_degree = new int[N+1];

        for(int i=1; i<=N; i++) {
            student[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            // A가 B보다 앞에 서 있어야 한다.
            int A = fr.nextInt(); int B = fr.nextInt();
            student[A].add(B);

            // B의 진입차수를 1 증가시킨다.
            in_degree[B]++;
        }
    }

    static void pro() {

        Queue<Integer> queue = new LinkedList<>();

        // 진입차수가 0인 것부터 queue에 넣음.
        for(int i=1; i<=N; i++) {
            if(in_degree[i] == 0) queue.offer(i);
        }

        while(!queue.isEmpty()) {
            int x = queue.poll();
            sb.append(x).append(" ");

            // x를 제거하기 때문에 x와 연결된 모든 노드에 진입차수를 1 빼준다.
            for(int y: student[x]) {
                in_degree[y]--;

                // 새로 진입차수가 0이 되었다면 queue에 넣음.
                if(in_degree[y] == 0) queue.offer(y);
            }
        }

        System.out.print(sb.toString());
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
