/*
 * BOJ 31429 SUAPC 2023 Summer
 *
 * memory : 14188kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31429 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] ranks = new String[12];

        ranks[1] = "12 1600";
        ranks[2] = "11 894";
        ranks[3] = "11 1327";
        ranks[4] = "10 1311";
        ranks[5] = "9 1004";
        ranks[6] = "9 1178";
        ranks[7] = "9 1357";
        ranks[8] = "8 837";
        ranks[9] = "7 1055";
        ranks[10] = "6 556";
        ranks[11] = "6 773";

        System.out.print(ranks[n]);
    }
}
