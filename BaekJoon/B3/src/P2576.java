/*
 * BOJ 2576 홀수
 *
 * memory : 14100kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2576 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number % 2 != 0) {
                sum += number;
                min = Math.min(number, min);
            }
        }

        if (sum == 0) System.out.println("-1");
        else System.out.println(sum);

        if (min != Integer.MAX_VALUE) System.out.print(min);
    }
}
