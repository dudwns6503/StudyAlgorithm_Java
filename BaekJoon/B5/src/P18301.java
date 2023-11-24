/*
 * BOJ 18301 Rats
 *
 * memory : 14128kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18301 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n12 = Integer.parseInt(st.nextToken());

        double n = (double)(n1 + 1) * (n2 + 1) / (n12 + 1) - 1;
        int ans = (int)Math.floor(n);

        System.out.print(ans);
    }
}
