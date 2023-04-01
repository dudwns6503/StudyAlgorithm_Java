/*
 * BOJ 2745 진법 변환
 *
 * memory : 14308kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;
        int temp = 1;
        for (int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                sum += (ch - 'A' + 10) * temp;
            } else {
                sum += (ch - '0') * temp;
            }

            temp *= b;
        }

        System.out.print(sum);
    }
}
