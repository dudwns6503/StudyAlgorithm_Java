/*
 * BOJ 30999 민주주의
 *
 * memory : 14664kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30999 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            int yes = 0;
            int no = 0;

            for (int j = 0; j < m; j++) {
                String approval = String.valueOf(word.charAt(j));

                if (approval.equals("O"))
                    yes++;
                else
                    no++;
            }

            if (yes > no)
                ans++;
        }

        System.out.print(ans);
    }
}
