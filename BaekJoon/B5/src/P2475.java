/*
 * BOJ 2475 검증수
 *
 * memory : 14360kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2475 {

    static void sol() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        while(st.hasMoreTokens()) {
            int N = Integer.parseInt(st.nextToken());

            sum += N*N;
        }

        System.out.println(sum % 10);
    }

    public static void main(String[] args) throws Exception {
        sol();
    }


}
