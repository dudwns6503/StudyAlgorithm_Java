/*
 * BOJ 24083 短針 (Hour Hand)
 *
 * memory : 14268kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24083 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int ans = (a + b) % 12 == 0 ? 12 : (a + b) % 12;

        System.out.print(ans);
    }
}
