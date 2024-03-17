/*
 * BOJ 25640 MBTI
 *
 * memory : 14268kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P25640 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jinho = br.readLine();

        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            String mbti = br.readLine();

            if (jinho.equals(mbti))
                ans++;
        }

        System.out.print(ans);
    }
}
