 /*
  * BOJ 2530 인공지능 시계
  *
  * memory : 14304kb
  * time : 124ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2530 {

    private static int hour, minute, second, d;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        hour = Integer.parseInt(st.nextToken());
        minute = Integer.parseInt(st.nextToken());
        second = Integer.parseInt(st.nextToken());

        d = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        second += d;
        if (second >= 60) {
            minute += second / 60;
            second %= 60;
        }

        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        sb.append(hour).append(" ").append(minute).append(" ").append(second);
        System.out.print(sb);
    }
}
