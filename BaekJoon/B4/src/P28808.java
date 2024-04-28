/*
 * BOJ 28808 Таблица результатов
 *
 * memory : 14128kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28808 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            String solution = br.readLine();

            if (solution.contains("+"))
                ans++;
        }

        System.out.print(ans);
    }
}
