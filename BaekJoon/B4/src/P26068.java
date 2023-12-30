/*
 * BOJ 26068 치킨댄스를 추는 곰곰이를 본 임스 2
 *
 * memory : 14364kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26068 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            String day = br.readLine();

            if (Integer.parseInt(day.substring(2)) <= 90)
                ans++;
        }

        System.out.print(ans);
    }
}
