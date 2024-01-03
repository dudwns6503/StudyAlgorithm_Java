/*
 * BOJ 20232 Archivist
 *
 * memory : 14132kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20232 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        String[] winner = new String[]{"ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO",
                "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
                "ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO"};

        System.out.print(winner[year - 1995]);
    }
}
