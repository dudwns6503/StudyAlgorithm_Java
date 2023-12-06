/*
 * BOJ 5575 타임 카드
 *
 * memory : 14120kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5575 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int inHour = Integer.parseInt(st.nextToken());
            int inMinute = Integer.parseInt(st.nextToken());
            int inSecond = Integer.parseInt(st.nextToken());

            int outHour = Integer.parseInt(st.nextToken());
            int outMinute = Integer.parseInt(st.nextToken());
            int outSecond = Integer.parseInt(st.nextToken());

            int calHour = outHour;
            int calMinute = outMinute;

            int calSecond = outSecond - inSecond;

            if (calSecond < 0) {
                calSecond += 60;
                calMinute -= 1;
            }

            calMinute -= inMinute;

            if (calMinute < 0) {
                calMinute += 60;
                calHour -= 1;
            }

            calHour -= inHour;

            sb.append(calHour).append(" ").append(calMinute).append(" ").append(calSecond).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

}
