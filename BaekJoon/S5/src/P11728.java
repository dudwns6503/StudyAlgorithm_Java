/*
 * BOJ 11728 배열 합치기
 *
 * memory : 301548kb
 * time : 1388ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11728 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < n + m; k++) {
            if (i >= n) {
                sb.append(b[j]).append(" ");
                j++;
                continue;
            }
            else if (j >= m) {
                sb.append(a[i]).append(" ");
                i++;
                continue;
            }


            if (a[i] > b[j]) {
                sb.append(b[j]).append(" ");
                j++;
            } else {
                sb.append(a[i]).append(" ");
                i++;
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
