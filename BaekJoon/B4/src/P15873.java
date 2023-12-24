/*
 * BOJ 15873 공백 없는 A+B
 *
 * memory : 14220kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15873 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();

        String a = "";
        String b = "";

        for (int i = 0; i < number.length(); i++) {
            String current = String.valueOf(number.charAt(i));
            a += current;

            if (Integer.parseInt(a) > 10) {
                a = a.substring(0, a.length() - 1);
                b += current;
            }
        }

        System.out.print(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
