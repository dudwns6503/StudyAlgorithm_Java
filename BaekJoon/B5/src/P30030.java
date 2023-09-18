/*
 * BOJ 30030 스위트콘 가격 구하기
 *
 * memory : 14172kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30030 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(br.readLine());

        System.out.print(b / 11 * 10);
    }
}
