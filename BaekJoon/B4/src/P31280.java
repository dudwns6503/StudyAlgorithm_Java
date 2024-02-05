/*
 * BOJ 31280 ФАКИР
 *
 * memory : 14176kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P31280 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] rats = new int[4];

        for (int i = 0; i < 4; i++) {
            rats[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rats);

        int ans = rats[3] + rats[2] + rats[1] + 1;
        System.out.print(ans);
    }
}
