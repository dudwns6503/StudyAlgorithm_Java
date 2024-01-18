/*
 * BOJ 14038 Tournament Selection
 *
 * memory : 14092kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14038 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        for (int i = 0; i < 6; i++) {
            String result = br.readLine();

            if (result.equals("W"))
                count++;
        }

        if (count >= 5)
            System.out.print("1");
        else if (count >= 3)
            System.out.print("2");
        else if (count >= 1)
            System.out.print("3");
        else
            System.out.print("-1");
    }
}
