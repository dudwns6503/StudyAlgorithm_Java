/*
 * BOJ 13580 Andando no tempo
 *
 * memory : 13580kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P13580 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] years = new int[3];

        years[0] = Integer.parseInt(st.nextToken());
        years[1] = Integer.parseInt(st.nextToken());
        years[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(years);

        if (years[0] == years[1] || years[1] == years[2])
            System.out.print("S");
        else if (years[2] == years[0] + years[1])
            System.out.print("S");
        else
            System.out.print("N");
    }
}
