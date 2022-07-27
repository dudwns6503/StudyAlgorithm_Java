/*
 * BOJ 20165 인내의 도미노 장인 호석
 *
 * memory : 240196kb
 * time : 1884ms
 */

import java.io.*;
import java.util.StringTokenizer;

public class P20165 {

    static FastReader fr = new FastReader();

    static int[][] map;
    static int[][] dominoMap;
    static int N, M, R, ans;

    static void input() {

        N = fr.nextInt();
        M = fr.nextInt();
        R = fr.nextInt();

        // 원본을 유지할 맵
        map = new int[N+1][M+1];
        // 세우고 넘어뜨릴 실제 도미노 맵
        dominoMap = new int[N+1][M+1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                map[i][j] = fr.nextInt();
                dominoMap[i][j] = map[i][j];
            }
        }
    }

    static void pro() {

        for(int i=1; i<=R; i++) {
            int x = fr.nextInt();
            int y = fr.nextInt();

            String direction = fr.next();

            // 공격
            attack(x, y, direction.charAt(0));

            x = fr.nextInt();
            y = fr.nextInt();

            // 수비
            dominoMap[x][y] = map[x][y];
        }

        System.out.println(ans);

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                if(dominoMap[i][j] == 0) System.out.print("F ");
                else System.out.print("S ");
            }
            System.out.println();
        }
    }

    static void attack(int x, int y, char dir) {
        if(dominoMap[x][y] == 0) return;

        int dx = 0; int dy = 0;

        if(dir == 'E') dy = 1;
        else if(dir == 'W') dy = -1;
        else if(dir == 'S') dx = 1;
        else dx = -1;

        int cnt = dominoMap[x][y];
        while(x >= 1 && x <= N && y >= 1 && y <= M && cnt >= 1) {

            if(dominoMap[x][y] != 0) ans++;

            cnt = Math.max(cnt - 1, dominoMap[x][y] - 1);

            dominoMap[x][y] = 0;

            x += dx;
            y += dy;
        }
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
