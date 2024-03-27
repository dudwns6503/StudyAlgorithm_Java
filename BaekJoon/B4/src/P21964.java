/*
 * BOJ 21964 선린인터넷고등학교 교가
 *
 * memory : 15332kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21964 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= n - 5; i--) {
            char ch = word.charAt(i);
            sb.append(ch);
        }

        System.out.print(sb.reverse());
    }
}
