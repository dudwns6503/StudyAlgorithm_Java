/*
 * BOJ 5086 배수와 약수
 *
 * memory : 14128kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5086 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;

            solve(a, b);
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void solve(int a, int b) {
        if (b % a == 0) {
            sb.append("factor").append("\n");
        } else if (a % b == 0) {
            sb.append("multiple").append("\n");
        } else {
            sb.append("neither").append("\n");
        }
    }
}
