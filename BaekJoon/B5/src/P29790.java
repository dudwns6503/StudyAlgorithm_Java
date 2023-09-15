/*
 * BOJ 29790 임스의 메이플 컵
 *
 * memory : 14208kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P29790 {

    private static int n, u, l;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        if (n >= 1000 && (u >= 8000 || l >= 260)) System.out.print("Very Good");
        else if (n >= 1000) System.out.print("Good");
        else System.out.print("Bad");
    }
}
