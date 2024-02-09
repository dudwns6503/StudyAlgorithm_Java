/*
 * BOJ 30319 Advance to Taoyuan Regional
 *
 * memory : 14144kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30319 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        if (year < 2023) {
            System.out.print("GOOD");
        } else if (year == 2023 && month <= 8) {
            System.out.print("GOOD");
        } else if (year == 2023 && month <= 9 && day <= 16) {
            System.out.print("GOOD");
        } else {
            System.out.print("TOO LATE");
        }
    }
}
