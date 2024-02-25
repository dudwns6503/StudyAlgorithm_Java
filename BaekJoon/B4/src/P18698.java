/*
 * BOJ 18698 The Walking Adam
 *
 * memory : 14124kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P18698 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String walk = br.readLine();
            int cnt = 0;

            for (int j = 0; j < walk.length(); j++) {
                if (walk.charAt(j) == 'U')
                    cnt++;
                else
                    break;
            }

            System.out.println(cnt);
        }
    }
}
