/*
 * BOJ 28938 Конвейер
 *
 * memory : 14376kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28938 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        solve(sum);
    }

    private static void solve(int sum) {
        if (sum > 0)
            System.out.print("Right");
        else if (sum < 0)
            System.out.print("Left");
        else
            System.out.print("Stay");
    }
}
