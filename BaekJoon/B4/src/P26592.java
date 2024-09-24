/*
 * BOJ 26592 Triangle Height
 *
 * memory : 14360kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26592 {

    private static StringBuilder sb = new StringBuilder();
    private static double area, base;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        sb.append(String.format("The height of the triangle is %.2f units", 2 * area / base)).append("\n");
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            area = Double.parseDouble(st.nextToken());
            base = Double.parseDouble(st.nextToken());

            solve();
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
