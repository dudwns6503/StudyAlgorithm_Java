/*
 * BOJ 15080 Every Second Counts
 *
 * memory : 14164kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15080 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " : ");
        int startHour = Integer.parseInt(st.nextToken());
        int startMinute = Integer.parseInt(st.nextToken());
        int startSecond = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " : ");
        int endHour = Integer.parseInt(st.nextToken());
        int endMinute = Integer.parseInt(st.nextToken());
        int endSecond = Integer.parseInt(st.nextToken());

        int sum = 0;
        if (endSecond < startSecond) {
            endMinute--;
            endSecond += 60;
        }

        endSecond -= startSecond;

        if (endMinute < startMinute) {
            endHour--;
            endMinute += 60;
        }

        endMinute -= startMinute;

        if (endHour < startHour) {
            endHour += 24;
        }

        endHour -= startHour;

        sum += endSecond;
        sum += endMinute * 60;
        sum += endHour * 60 * 60;

        System.out.print(sum);
    }
}
