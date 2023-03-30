/*
 * BOJ 24264 알고리즘 수업 - 알고리즘의 수행 시간 3
 *
 * memory : 14184kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24264 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(n * n);
        System.out.print(2);
    }
}
