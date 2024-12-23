/*
 * BOJ 32941 왜 맘대로 예약하냐고
 *
 * memory : 14556kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32941 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (num == x)
                    break;

                if (j == k - 1) {
                    System.out.print("NO");
                    return;
                }
            }
        }

        System.out.print("YES");
    }
}
