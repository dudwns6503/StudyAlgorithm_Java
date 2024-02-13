/*
 * BOJ 27880 Gahui and Soongsil University station
 *
 * memory : 14216kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27880 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());

            String method = st.nextToken();
            int length = Integer.parseInt(st.nextToken());

            if (method.equals("Es"))
                sum += length * 21;
            else
                sum += length * 17;
        }

        System.out.print(sum);
    }
}
