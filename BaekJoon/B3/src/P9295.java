/*
 * BOJ 9295 주사위
 *
 * memory : 14924kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9295 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int caseNumber = 1;
        while (caseNumber <= t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append("Case ").append(caseNumber).append(": ").append(a + b).append("\n");
            caseNumber++;
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
