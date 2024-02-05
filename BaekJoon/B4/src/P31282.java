/*
 * BOJ 31282 ЛОВНО КУЧЕ
 *
 * memory : 14272kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P31282 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int day = n / (k - m);

        if (n % (k - m) != 0)
            day++;

        System.out.print(day);
    }
}
