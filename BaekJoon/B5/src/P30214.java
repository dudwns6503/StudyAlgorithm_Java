/*
 * BOJ 30214 An Easy-Peasy Problem
 *
 * memory : 14184kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30214 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double half = Double.parseDouble(st.nextToken());
        double end = Double.parseDouble(st.nextToken());

        if (half >= end / 2)
            System.out.print("E");
        else
            System.out.print("H");
    }
}
