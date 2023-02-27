/*
 * BOJ 10798 세로읽기
 *
 * memory : 14336kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10798 {

    private static String[] strings;
    private static int max;

    /**
     *  strings: 5개의 문자열을 저장할 String 배열
     *  max : 5개의 문자열 중 가장 긴 문자열의 길이
     *
     *  max보다 작은 문자열들은 공백으로 채운 후(NullPointException 방지) StringBuilder에 저장한다.
     *  이후에, 공백(" ")을 ""으로 변환한 후 답을 출력한다.
     */
    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        strings = new String[5];
        max = -1;

        for (int i = 0; i < 5; i++) {
            strings[i] = br.readLine();

            if (strings[i].length() > max) {
                max = strings[i].length();
            }
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            while (strings[i].length() < max) {
                strings[i] += " ";
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(strings[j].charAt(i));
            }
        }

        String ans = sb.toString().replace(" ", "");
        System.out.print(ans);
    }
}
