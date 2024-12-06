/*
 * BOJ 32278 선택 가능성이 가장 높은 자료형
 *
 * memory : 14172kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32278 {

    private static long n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.print("short");
        } else if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.print("int");
        } else {
            System.out.print("long long");
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Long.parseLong(br.readLine());
    }
}
