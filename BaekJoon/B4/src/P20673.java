/*
 * BOJ 20673 Covid-19
 *
 * memory : 14144kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20673 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());

        if (p <= 50 && q <= 10)
            System.out.print("White");
        else if (q > 30)
            System.out.print("Red");
        else
            System.out.print("Yellow");
    }
}
