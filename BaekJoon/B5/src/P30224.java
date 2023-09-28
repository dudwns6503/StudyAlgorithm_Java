/*
 * BOJ 30224 Lucky 7
 *
 * memory : 14320kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30224 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();

        solve(number);
    }

    private static void solve(String number) {
        boolean hasSeven = false;
        boolean isDivisibleBySeven = false;

        if (number.contains("7")) {
            hasSeven = true;
        }

        int num = Integer.parseInt(number);

        if (num % 7 == 0) isDivisibleBySeven = true;

        if (!hasSeven && !isDivisibleBySeven) System.out.print("0");
        else if (!hasSeven && isDivisibleBySeven) System.out.print("1");
        else if (hasSeven && !isDivisibleBySeven) System.out.print("2");
        else System.out.print("3");
    }
}
