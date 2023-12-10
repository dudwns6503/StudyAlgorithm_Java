/*
 * BOJ 6778 Which Alien?
 *
 * memory : 14012kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6778 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        if (antenna >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }

        if (antenna <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }

        if (antenna <= 2 && eyes <= 3) {
            System.out.print("GraemeMercurian");
        }
    }
}
