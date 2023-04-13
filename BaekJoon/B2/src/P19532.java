 /*
  * BOJ 19532 수학은 비대면강의입니다
  *
  * memory : 16044kb
  * time : 160ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19532 {

    private static int a, b, c, d, e, f;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if ((a * i + b * j == c) && (d * i + e * j == f)) {
                    System.out.print(i + " " + j);
                    return;
                }
            }
        }
    }
}
