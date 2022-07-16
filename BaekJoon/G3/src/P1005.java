/*
 * BOJ 1005 ACM Craft
 *
 * memory : 236520kb
 * time : 832ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1005 {

    static FastReader fr = new FastReader();

    static ArrayList<Integer>[] building;
    static int[] time, build_time, in_degree;
    static int test_case, N, K, endNumber;

    static void input() {

        N = fr.nextInt();
        K = fr.nextInt();

        building = new ArrayList[N+1]; // 각 건물의 짓는 순서를 나타낼 ArrayList

        time = new int[N+1]; //  각 건물의 짓는 시간을 담는 배열
        build_time = new int[N+1]; // 이전 건물의 짓는 시간을 고려한 건물의 최종 건설 시간

        in_degree = new int[N+1]; // 진입차수의 개수를 담는 배열

        for(int i=1; i<=N; i++) {
            building[i] = new ArrayList<>();
        }

        for(int i=1; i<=N; i++) {
            time[i] = fr.nextInt();
        }

        for(int i=0; i<K; i++) {
            int x = fr.nextInt(); int y = fr.nextInt();

            // 건물 X를 지은 다음에 건물 Y를 지을 수 있다.
            building[x].add(y);
            // 건물 Y의 진입차수를 1 증가시킨다.
            in_degree[y]++;
        }

        // 건설해야할 건물의 번호
        endNumber = fr.nextInt();
    }

    static void pro() {

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            // 진입차수가 0인 건물을 큐에 담으면서, 그 건물의 짓는 시간은 이전 건물에 영향을 받지 않으므로
            // 바로 최종 건설시간에 넣어준다.
            if(in_degree[i] == 0) {
                queue.offer(i);
                build_time[i] = time[i];
            }
        }

        while(!queue.isEmpty()) {
            int x = queue.poll();

            for(int y: building[x]) {
                // 어떤 건물의 짓는 시간은
                // 여러 개의 이전 건물의 짓는 시간 중 더 긴 시간 후에 건물을 지을 수 있으므로
                // 최댓값을 담아준다.
                build_time[y] = Math.max(build_time[y], build_time[x] + time[y]);

                in_degree[y]--;
                if(in_degree[y] == 0) queue.offer(y);
            }
        }

        System.out.println(build_time[endNumber]);
    }

    public static void main(String[] args) {

        test_case = fr.nextInt();

        while(test_case-- > 0) {
            input();
            pro();
        }
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