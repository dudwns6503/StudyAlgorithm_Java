/*
 * BOJ 33689 CPDU
 *
 * memory : 14160kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33689 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.startsWith("C"))
                cnt++;
        }

        System.out.print(cnt);
    }
}
