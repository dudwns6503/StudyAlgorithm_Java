/*
 * BOJ 30979 유치원생 파댕이 돌보기
 *
 * memory : 14204kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30979 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int minuteSum = 0;
        for (int i = 0; i < n; i++) {
            minuteSum += Integer.parseInt(st.nextToken());
        }

        if (t <= minuteSum)
            System.out.print("Padaeng_i Happy");
        else
            System.out.print("Padaeng_i Cry");
    }
}
