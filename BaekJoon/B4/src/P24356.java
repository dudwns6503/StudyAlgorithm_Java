/*
 * BOJ 24356 ЧАСОВНИК
 *
 * memory : 16148kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24356 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        int hour = 0;
        int minute = 0;

        if (m2 >= m1) {
            minute = m2 - m1;
        } else {
            t2--;
            minute = m2 + 60 - m1;
        }

        if (t2 >= t1) {
            hour = t2 - t1;
        } else {
            hour = 24 - t1 + t2;
        }

        int ans = hour * 60 + minute;
        System.out.print(hour * 60 + minute + " " + ans / 30);
    }
}
