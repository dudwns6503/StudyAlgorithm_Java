/*
 * BOJ 28702 FizzBuzz
 *
 * memory : 14252kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28702 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int currentCount = 0;
        String value = "";
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            ++currentCount;
            str[i] = br.readLine();

            if (str[i].contains("Fizz") || str[i].contains("Buzz"))
                continue;
            else {
                count = currentCount;
                value = str[i];
            }
        }

        int ans = Integer.parseInt(value) + (4 - count);
        if (ans % 3 == 0 && ans % 5 == 0)
            System.out.print("FizzBuzz");
        else if (ans % 3 == 0)
            System.out.print("Fizz");
        else if (ans % 5 == 0)
            System.out.print("Buzz");
        else
            System.out.print(ans);
    }
}
