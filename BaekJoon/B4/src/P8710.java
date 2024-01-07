/*
 * BOJ 8710 Koszykarz
 *
 * memory : 14024kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P8710 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ans = 0;

        if (w - k <= 0)
            System.out.print("0");
        else{
            ans += (w - k) / m;

            if ((w - k) % m != 0)
                ans++;
        }

        System.out.print(ans);
    }
}
