/*
 * BOJ 11721 열 개씩 끊어 출력하기
 *
 * memory : 14240kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11721 {

    static StringBuilder sb = new StringBuilder();
    static String N;

    static void input() throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = br.readLine();
    }

    static void sol() {

        for(int i=1; i<=N.length(); i++) {
            sb.append(N.charAt(i-1));
            if(i % 10 == 0) sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        input();
        sol();
    }
}
