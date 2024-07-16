/*
 * BOJ 1253 좋다
 *
 * memory : 14792kb
 * time : 156ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int ans = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;

            while (l < r) {
                if (a[l] + a[r] == a[i]) {
                    if (l != i && r != i) {
                        ans++;
                        break;
                    } else if (l == i) {
                        l++;
                    } else if (r == i) {
                        r--;
                    }
                } else if (a[l] + a[r] > a[i]) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        System.out.print(ans);
    }
}
