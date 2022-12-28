/*
 * BOJ 11659 구간 합 구하기 4
 *
 * memory : 60120kb
 * time : 728ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        int[] sum = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sum[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i-1] + arr[i];
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int result = sum[end] - sum[start-1];
            sb.append(result).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
