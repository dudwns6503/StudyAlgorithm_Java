/*
 * BOJ 1284 집 주소
 *
 * memory : 14292kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1284 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) break;

            solve(num);
        }
    }

    private static void solve(int num) {
        int width = 2;
        int digits = 0;

        while (num != 0) {
            digits++;

            int currentNumber = num % 10;

            if (currentNumber == 0)
                width += 4;
            else if (currentNumber == 1)
                width += 2;
            else
                width += 3;

            num /= 10;
        }

        width += digits - 1;
        System.out.println(width);
    }
}
