/*
 * BOJ 2581 소수
 *
 * memory : 14248kb
 * time : 136ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2581 {

    static FastReader fr = new FastReader();

    static ArrayList<Integer> realPrime = new ArrayList<>();
    static int[] prime;
    static int M, N, sum;

    static void input() {

        M = fr.nextInt();
        N = fr.nextInt();
    }

    static boolean isPrime(int number) {

        if(prime[number] != 0) return true;
        return false;
    }

    // 에라토스테네스의 체
    static void FindDecimals() {

        prime = new int[10001];

        prime[0] = prime[1] = 0;

        for(int i=2; i<=10000; i++) {
            prime[i] = i;
        }

        for(int i=2; i<10000; i++) {
            for(int j=2*i; j<=10000; j+=i) {
                if(prime[j] == 0) continue;

                prime[j] = 0;
            }
        }
    }

    static void pro() {

        FindDecimals();

        for(int i=M; i<=N; i++) {
            if(isPrime(i)) realPrime.add(i);
        }

        Collections.sort(realPrime);

        if(realPrime.size() == 0) {
            System.out.print(-1);
            return;
        }

        for(int i=0; i<realPrime.size(); i++) {
            sum += realPrime.get(i);
        }

        System.out.println(sum);
        System.out.print(realPrime.get(0));
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
