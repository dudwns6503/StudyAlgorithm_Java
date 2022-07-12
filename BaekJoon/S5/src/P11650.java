/*
 * BOJ 11650 좌표 정렬하기
 *
 * memory : 48804kb
 * time : 836ms
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11650 {

    static StringBuilder sb = new StringBuilder();

    static class Coordinate implements Comparable<Coordinate> {
        int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate other) {
            // 1. x좌표 기준으로 오름차순으로 정렬
            if(this.x > other.x) {
                return 1;
            }
            else if(this.x < other.x) {
                return -1;
            }
            // 2. x좌표가 같다면 y좌표를 기준으로 오름차순으로 정렬
            else {
                return this.y - other.y;
            }
        }
    }

    static void input() throws Exception {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        coordinates = new Coordinate[N];

        StringTokenizer st;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            coordinates[i] = new Coordinate(x, y);
        }

    }

    static Coordinate[] coordinates;

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }

    static void pro() {

        Arrays.sort(coordinates);

        for(int i=0; i<coordinates.length; i++) {
            sb.append(coordinates[i].x).append(" ").append(coordinates[i].y);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
