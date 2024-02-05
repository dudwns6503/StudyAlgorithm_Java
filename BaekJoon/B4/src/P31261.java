/*
 * BOJ 31261 НАМИСЛИХ СИ ЧИСЛО
 *
 * memory : 14140kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P31261 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = ((b + a) * a + a) * a;
        System.out.print(ans);
    }
}
