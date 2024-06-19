/*
 * BOJ 25704 출석 이벤트
 *
 * memory : 14232kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P25704 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int min = p;

        if (n >= 5) {
            min = Math.min(min, Math.max(p - 500, 0));
        }

        if (n >= 10) {
            min = Math.min(min, (p * 9 / 10));
        }

        if (n >= 15) {
            min = Math.min(min, Math.max(p - 2000, 0));
        }

        if (n >= 20) {
            min = Math.min(min, (p * 75 / 100));
        }

        System.out.print(min);
    }
}
