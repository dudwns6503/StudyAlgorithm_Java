/*
 * BOJ 13496 The Merchant of Venice
 *
 * memory : 14392kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13496 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int[] shipDistance = new int[n];
            int[] cost = new int[n];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                shipDistance[j] = Integer.parseInt(st.nextToken());
                cost[j] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (s * d >= shipDistance[j])
                    sum += cost[j];
            }

            sb.append("Data Set ").append(i).append(":").append("\n").append(sum).append("\n").append("\n");
        }

        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }
}
