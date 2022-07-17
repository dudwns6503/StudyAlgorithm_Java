/*
 * BOJ 14676 영우는 사기꾼?
 *
 * memory : 71276kb
 * time : 540ms
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P14676 {

    static FastReader fr = new FastReader();

    static ArrayList<Integer>[] building;
    static int[] in_degree, built, satisfaction;
    static int N, M, K;

    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();
        K = fr.nextInt();

        in_degree = new int[N+1];
        building = new ArrayList[N+1];

        satisfaction = new int[N+1];
        built = new int[N+1];

        for(int i=1; i<=N; i++) {
            building[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            int x = fr.nextInt(), y = fr.nextInt();

            building[x].add(y);
            in_degree[y]++;
        }
    }

    static void pro() {

        boolean lier = false;
        while(K-- > 0) {

            int behavior = fr.nextInt(), currentBuilding = fr.nextInt();

            if(behavior == 1) {
                // 지금 건물의 이전 건물들이 지어졌는지 확인.
                if(satisfaction[currentBuilding] < in_degree[currentBuilding])
                    lier = true;

                built[currentBuilding]++;

                if(built[currentBuilding] == 1)
                    for(int y: building[currentBuilding])
                        satisfaction[y]++;
            }
            else {
                // 철거할 때, currentBuilding이 한 개 이상 지어져있는지 확인
                if(built[currentBuilding] == 0)
                    lier = true;

                built[currentBuilding]--;

                if(built[currentBuilding] == 0)
                    for(int y: building[currentBuilding])
                        satisfaction[y]--;
            }
        }

        if(lier) System.out.println("Lier!");
        else System.out.println("King-God-Emperor");
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
