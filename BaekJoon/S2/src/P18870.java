/*
 * BOJ 18870 좌표 압축
 *
 * memory : 240196kb
 * time : 1884ms
 */

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P18870 {

    static FastReader fr = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    static int[] arr;
    static int[] sortedArr;
    static int N;

    static void input() {

        N = fr.nextInt();

        arr = new int[N];
        sortedArr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sortedArr[i] = fr.nextInt();
        }
    }

    static void pro() {

        Arrays.sort(sortedArr);

        int rank = 0;
        for(int i: sortedArr) {

            if(!hashMap.containsKey(i)) {
                hashMap.put(i, rank);
                rank++;
            }
        }

        for(int i: arr) {
            int ranking = hashMap.get(i);
            sb.append(ranking).append(" ");
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