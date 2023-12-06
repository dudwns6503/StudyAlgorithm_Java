/*
 * BOJ 5928 Contest Timing
 *
 * memory : 14068kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5928 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(st.nextToken());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if (day < 11 || (day == 11 && hour < 11) || (day == 11 && hour == 11 && minute < 11))
            sb.append("-1");
        else {
            int sumMinute = minute - 11;
            if (sumMinute < 0) {
                sumMinute += 60;
                hour -= 1;
            }

            if ((hour - 11) < 0) {
                hour += 24;
                day -= 1;
            }

            sumMinute += 60 * (hour - 11);
            sumMinute += 24 * 60 * (day - 11);
            sb.append(sumMinute);
        }

        System.out.print(sb);
    }
}
