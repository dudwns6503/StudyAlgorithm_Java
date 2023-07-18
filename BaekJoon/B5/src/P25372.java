/*
 * BOJ 25372 성택이의 은밀한 비밀번호
 *
 * memory : 13992kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P25372 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (checkPassword(br.readLine())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean checkPassword(String str) {
        return str.length() >= 6 && str.length() <= 9;
    }
}
