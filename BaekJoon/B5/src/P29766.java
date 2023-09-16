/*
 * BOJ 29766 DKSH 찾기
 *
 * memory : 14180kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P29766 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        solve(str);
    }

    private static void solve(String str) {
        int count = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.startsWith("DKSH", i)) count++;
        }

        System.out.print(count);
    }
}
