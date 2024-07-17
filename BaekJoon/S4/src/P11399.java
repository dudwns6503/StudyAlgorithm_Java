/*
 * BOJ 11399 ATM
 *
 * memory : 14464kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] time = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);

        int ans = 0;
        int wasteTime = 0;
        for (int i = 0; i < n; i++) {
            wasteTime += time[i];
            ans += wasteTime;
        }

        System.out.print(ans);
    }
}
