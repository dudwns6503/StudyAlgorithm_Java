/*
 * BOJ 24511 queuestack
 *
 * memory : 51184kb
 * time : 624ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P24511 {

    private static ArrayList<Integer> queueIndex;
    private static int[] a, b, c;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(queueIndex, Collections.reverseOrder());

        int index = 0;
        int length = Math.min(queueIndex.size(), m);
        while (index < length) {
            int num = b[queueIndex.get(index)];

            sb.append(num).append(" ");

            index++;
            m--;
        }

        for (int i = 0; i < m; i++) {
            sb.append(c[i]).append(" ");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        a = new int[n];
        b = new int[n];
        queueIndex = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());

            if (a[i] == 0)
                queueIndex.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine());

        c = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }
    }
}
