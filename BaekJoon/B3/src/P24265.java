/*
 * BOJ 24265 알고리즘 수업 - 알고리즘의 수행 시간 4
 *
 * memory : 14140kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24265 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }

        System.out.println(sum);
        System.out.print(2);
    }
}
