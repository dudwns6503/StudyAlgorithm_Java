/*
 * BOJ 28940 Дневник Гравити Фолз
 *
 * memory : 14120kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28940 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > w || b > h)
            System.out.print("-1");
        else {
            int width = w / a;
            int height = h / b;

            int sum = width * height;

            int ans = n / sum;
            if (n % sum != 0)
                ans++;

            System.out.print(ans);
        }
    }
}
