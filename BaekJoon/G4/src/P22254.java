import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P22254 {

    static FastReader fr = new FastReader();

    static int N, X;
    static int[] a;

    static void input() {

        N = fr.nextInt();
        X = fr.nextInt();
        a = new int[N+1];
        for(int i=1; i<=N; i++) a[i] = fr.nextInt();

    }

    static boolean determination(int num) {
        PriorityQueue<Integer> pq;

        pq = new PriorityQueue<>();

        for(int i=1; i<=num; i++) pq.add(0);

        for(int i=1; i<=N; i++) {
            int pick = pq.poll();

            if(pick + a[i] > X) return false;
            pq.add(pick + a[i]);
        }

        return true;
    }

    static void pro() {
        int L = 1, R = N, ans = N;

        while(L <= R) {
            int mid = (L + R) / 2;
            if(determination(mid)) {
                ans = mid;
                R = mid - 1;
            }
            else {
                L = mid + 1;
            }
        }
        System.out.println(ans);
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
