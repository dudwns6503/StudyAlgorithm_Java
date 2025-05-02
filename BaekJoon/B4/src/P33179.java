/*
 * BOJ 33179 Hezardastan’s Annual Report
 *
 * memory : 14320kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P33179 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (current % 2 != 0)
                sum += current / 2 + 1;
            else
                sum += current / 2;
        }

        System.out.print(sum);
    }
}
