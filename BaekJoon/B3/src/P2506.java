 /*
  * BOJ 2506 점수계산
  *
  * memory : 14156kb
  * time : 128ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2506 {

    private static int[] exams;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        exams = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            exams[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        int count = 1;
        int sum = 0;

        for (int i = 0; i < exams.length; i++) {
            if (exams[i] == 1) {
                sum += count++;
            } else {
                count = 1;
            }
        }

        System.out.print(sum);
    }
}
