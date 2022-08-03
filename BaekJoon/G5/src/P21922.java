/*
 * BOJ 21922 학부 연구생 민상
 *
 * memory : 465356kb
 * time : 2244ms
 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P21922 {

    static class Node {
        int x, y, dir;

        public Node(int x, int y, int dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }
    }

    static FastReader fr = new FastReader();
    static boolean[][][] visited;
    static boolean[][] checked;
    static int[][] laboratory;
    // 상, 하, 좌, 우
    static int[][] dxdy = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N, M, ans;

    static void input() {
        N = fr.nextInt();
        M = fr.nextInt();

        laboratory = new int[N][M];
        visited = new boolean[N][M][4];
        checked = new boolean[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                laboratory[i][j] = fr.nextInt();
            }
        }
    }

    static void pro() {
        Queue<Node> start = new LinkedList<>();

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(laboratory[i][j] == 9) {
                    start.add(new Node(i, j, -1));
                }
            }
        }

        Queue<Node> queue = new LinkedList<>();

        while(!start.isEmpty()) {
            Node cur = start.poll();
            int x = cur.x;
            int y = cur.y;

            for(int k=0; k<4; k++) {
                int nx = x + dxdy[k][0];
                int ny = y + dxdy[k][1];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(visited[nx][ny][k]) continue;

                visited[nx][ny][k] = true;
                queue.add(new Node(nx, ny, k));
                checked[nx][ny] = true;
            }
            checked[x][y] = true;
        }

        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            int x = cur.x;
            int y = cur.y;
            int dir = cur.dir;

            dir = changeDir(laboratory[x][y], dir);

            int nx = x + dxdy[dir][0];
            int ny = y + dxdy[dir][1];

            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if(visited[nx][ny][dir]) continue;

            visited[nx][ny][dir] = true;
            queue.add(new Node(nx, ny, dir));
            checked[nx][ny] = true;
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(checked[i][j]) ans++;
            }
        }

        System.out.print(ans);
    }

    /**
     *
     * @param type : 물건의 종류
     * @param dir : 바람이 들어오는 방향
     * @return : 물건에 의해 바뀐 바람의 방향
     */
    static int changeDir(int type, int dir) {
        if(type == 1) {
            if(dir == 2) return 3;
            if(dir == 3) return 2;
        }
        else if(type == 2) {
            if(dir == 0) return 1;
            if(dir == 1) return 0;
        }
        else if(type == 3) {
            if(dir == 0) return 3;
            if(dir == 1) return 2;
            if(dir == 2) return 1;
            if(dir == 3) return 0;
        }
        else if(type == 4) {
            if(dir == 0) return 2;
            if(dir == 1) return 3;
            if(dir == 2) return 0;
            if(dir == 3) return 1;
        }
        return dir;
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
