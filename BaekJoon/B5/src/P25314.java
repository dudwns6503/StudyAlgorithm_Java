/*
 * BOJ 25314 코딩은 체육과목 입니다
 *
 * memory : 14160kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P25314 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        n /= 4;

        for (int i = 0; i < n; i++) {
            sb.append("long").append(" ");
        }
        sb.append("int");

        System.out.print(sb);
    }
}
