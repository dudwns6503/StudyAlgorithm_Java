/*
 * BOJ 30791 gahui and sousenkyo 1
 *
 * memory : 14280kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P30791 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] votes = new int[5];

        for (int i = 0; i < 5; i++) {
            votes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(votes);

        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (votes[4] <= votes[i] + 1000)
                ans++;
        }

        System.out.print(ans);
    }
}
