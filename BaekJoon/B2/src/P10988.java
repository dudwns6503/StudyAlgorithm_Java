/*
 * BOJ 10988 팰린드롬인지 확인하기
 *
 * memory : 14328kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10988 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        sb.append(str);
        sb.reverse();

        if (str.equals(sb.toString())) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
