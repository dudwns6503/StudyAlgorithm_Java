/*
 * BOJ 10250 ACM 호텔
 *
 * memory : 14280kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10250 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static int h, w, n;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            input();
            solve();

        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int floor = n % h == 0 ? h : (n % h);
        int room = n % h == 0 ? (n / h) : (n / h + 1);

        if (room < 10) {
            sb.append(floor).append("0").append(room).append("\n");
        } else {
            sb.append(floor).append(room).append("\n");
        }
    }
}
