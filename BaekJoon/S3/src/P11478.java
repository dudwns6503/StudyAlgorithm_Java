/*
 * BOJ 11478 서로 다른 부분 문자열의 개수
 *
 * memory : kb
 * time : ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P11478 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Set<String> sub_str = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                sub_str.add(str.substring(i, j));
            }
        }

        System.out.print(sub_str.size());
    }
}
