/*
 * BOJ 28238 정보 선생님의 야망
 *
 * memory : 330336kb
 * time : 992ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28238 {

    private static int[][] students;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        students = new int[n][5];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void solve() {
        int[] ans = new int[5];
        int max = -1;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                int sum = 0;

                for (int k = 0; k < n; k++) {
                    if (students[k][i] == 1 && students[k][j] == 1) sum++;
                }

                if (max < sum) {
                    max = sum;
                    ans = new int[5];
                    ans[i] = 1;
                    ans[j] = 1;
                }
            }
        }

        print(ans, max);
    }

    private static void print(int[] ans, int max) {
        StringBuilder sb = new StringBuilder();

        sb.append(max).append("\n");
        for (int i = 0; i < 5; i++) {
            sb.append(ans[i]).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
