/*
 * BOJ 21638 SMS from MCHS
 *
 * memory : 14148kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21638 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int todayTemperature = Integer.parseInt(st.nextToken());
        int todayWindSpeed = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int tomorrowTemperature = Integer.parseInt(st.nextToken());
        int tomorrowWindSpeed = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if (tomorrowTemperature < 0 && tomorrowWindSpeed >= 10) {
            sb.append("A storm warning for tomorrow! Be careful and stay home if possible!");
        } else {
            if (tomorrowTemperature < todayTemperature) {
                sb.append("MCHS warns! Low temperature is expected tomorrow.");
            } else if (tomorrowWindSpeed > todayWindSpeed) {
                sb.append("MCHS warns! Strong wind is expected tomorrow.");
            }
        }

        if (sb.length() == 0)
            sb.append("No message");

        System.out.print(sb);
    }
}
