/*
 * BOJ 30019 강의실 예약 시스템
 *
 * memory : 76012kb
 * time : 588ms
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P30019 {

    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] endTimes = new int[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int roomNumber = Integer.parseInt(st.nextToken());
            int startTime = Integer.parseInt(st.nextToken());
            int newEndTime = Integer.parseInt(st.nextToken());

            if (startTime >= endTimes[roomNumber]) {
                endTimes[roomNumber] = newEndTime;
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
