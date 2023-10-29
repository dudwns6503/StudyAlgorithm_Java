/*
 * BOJ 21598 SciComLove
 *
 * memory : 14116kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21598 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append("SciComLove").append("\n");
        }

        if (sb.length() > 0)
            System.out.print(sb);
    }
}
