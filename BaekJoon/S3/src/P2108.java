/*
 * BOJ 2108 통계학
 *
 * memory : 74764kb
 * time : 704ms
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2108 {

    static StringBuilder sb = new StringBuilder();
    static FastReader fr = new FastReader();

    static int[] arr;
    static int N;

    static void input() {

        N = fr.nextInt();

        arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = fr.nextInt();
        }
    }

    static void pro() {

        Arrays.sort(arr);
        int sum = 0;
        int[] count = new int[8001];

        for(int i=0; i<N; i++) {
            sum += arr[i];
            count[arr[i]+4000]++;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<count.length; i++) {
            max = Math.max(max, count[i]);
        }

        int choibin = 4001;
        int cnt = 0;
        for(int i=0; i<count.length; i++) {
            if(count[i] == max) {
                choibin = i-4000;
                cnt++;
            }
            if(cnt == 2) {
                break;
            }
        }

        int ans = (int) Math.round((double) sum / N);

        sb.append(ans).append("\n");
        sb.append(arr[N/2]).append("\n");
        sb.append(choibin).append("\n");
        sb.append(arr[N-1] - arr[0]);

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
