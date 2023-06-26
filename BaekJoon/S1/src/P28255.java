/*
 * BOJ 28255 3단 초콜릿 아이스크림
 *
 * memory : 16172kb
 * time : 160ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28255 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            sb.append(solve(br.readLine())).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static int solve(String word) {
        if (order1(word) || order2(word) || order3(word) || order4(word)) return 1;
        else return 0;
    }

    // S = S' + rev(S') + S'
    private static boolean order1(String original) {
        StringBuilder sb = new StringBuilder();

        sb.append(half(original));
        sb.append(reverse(half(original)));
        sb.append(half(original));

        return sb.toString().equals(original);
    }

    // S = S' + tail(rev(S')) + S'
    private static boolean order2(String original) {
        StringBuilder sb = new StringBuilder();
        sb.append(half(original));
        sb.append(tail(reverse(half(original))));
        sb.append(half(original));

        return sb.toString().equals(original);
    }

    // S = S' + rev(S') + tail(S')
    private static boolean order3(String original) {
        StringBuilder sb = new StringBuilder();
        sb.append(half(original));
        sb.append(reverse(half(original)));
        sb.append(tail(half(original)));

        return sb.toString().equals(original);
    }

    // S = S' + tail(rev(S')) + tail(S')
    private static boolean order4(String original) {
        StringBuilder sb = new StringBuilder();
        sb.append(half(original));
        sb.append(tail(reverse(half(original))));
        sb.append(tail(half(original)));

        return sb.toString().equals(original);
    }

    private static String half(String word) {
        int length = word.length();

        if (length % 3 == 0) {
            length = word.length() / 3;
        } else {
            length = word.length() / 3 + 1;
        }

        return word.substring(0, length);
    }

    private static String reverse(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }

    private static String tail(String word) {
        return word.substring(1);
    }
}
