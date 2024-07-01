/*
 * BOJ 25893 Majestic 10
 *
 * memory : 14024kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25893 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            String ans = Check(a, b, c);
            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
            sb.append(ans).append("\n");
            sb.append("\n");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }

    private static String Check(int a, int b, int c) {
        int higherThanTen = 0;

        if (a >= 10)
            higherThanTen++;
        if (b >= 10)
            higherThanTen++;
        if (c >= 10)
            higherThanTen++;

        if (higherThanTen == 0)
            return "zilch";
        else if (higherThanTen == 1)
            return "double";
        else if (higherThanTen == 2)
            return "double-double";
        else
            return "triple-double";
    }
}
