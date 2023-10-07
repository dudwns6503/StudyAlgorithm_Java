/*
 * BOJ 29807 학번을 찾아줘!
 *
 * memory : 14196kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P29807 {

    private static int t;
    private static int[] scores;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        scores = new int[5];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            if (st.hasMoreTokens())
                scores[i] = Integer.parseInt(st.nextToken());
            else break;
        }

        solve();
    }

    private static void solve() {
        int sum = 0;

        if (scores[0] > scores[2]) {
            sum += (scores[0] - scores[2]) * 508;
        } else {
            sum += (scores[2] - scores[0]) * 108;
        }

        if (scores[1] > scores[3]) {
            sum += (scores[1] - scores[3]) * 212;
        } else {
            sum += (scores[3] - scores[1]) * 305;
        }

        if (t == 5) {
            sum += scores[4] * 707;
        }

        System.out.print(sum * 4763);
    }
}
