/*
 * BOJ 1546 평균
 *
 * memory : 16384kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        double[] scores = new double[n];
        double max = -1;

        st = new StringTokenizer(br.readLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            sum += scores[i];

            if (scores[i] > max)
                max = scores[i];
        }

        double ans = (sum / max * 100) / n;

        System.out.print(ans);
    }
}
