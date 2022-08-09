/*
 * BOJ 21941 문자열 제거
 *
 * memory : 204596kb
 * time : 572ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P21941 {

    static HashMap<String, Integer> hashMap = new HashMap<>();
    static int[] dp;
    static String S;
    static int M;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        S = br.readLine();
        M = Integer.parseInt(br.readLine());
        dp = new int[S.length()+1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            String A = st.nextToken();
            int X = Integer.parseInt(st.nextToken());

            hashMap.put(A, X);
        }
    }

    static void sol() {
        String prev = "";

        for(int i=1; i<=S.length(); i++) {
            String c = Character.toString(S.charAt(i-1));
            prev += c;

            for(int j=0; j<prev.length(); j++) {
                String s = prev.substring(j);

                if(hashMap.containsKey(s)) dp[i] = Math.max(dp[i], dp[i - s.length()] + hashMap.get(s));
            }

            dp[i] = Math.max(dp[i], dp[i-1] + 1);
        }

        System.out.println(dp[S.length()]);
    }

    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
}
