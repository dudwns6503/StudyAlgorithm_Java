/*
 * BOJ 8871 Zadanie próbne 2
 *
 * memory : 14272kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P8871 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append((n + 1) * 2).append(" ").append((n + 1) * 3);
        System.out.print(sb);
    }
}
