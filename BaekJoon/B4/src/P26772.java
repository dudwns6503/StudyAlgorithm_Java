/*
 * BOJ 26772 Poziome serca
 *
 * memory : 67496kb
 * time : 356ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26772 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder third = new StringBuilder();
        StringBuilder fourth = new StringBuilder();
        StringBuilder fifth = new StringBuilder();
        StringBuilder sixth = new StringBuilder();
        StringBuilder seventh = new StringBuilder();
        StringBuilder eighth = new StringBuilder();
        StringBuilder nineth = new StringBuilder();
        for (int i = 0; i < n; i++) {
            first.append(" @@@   @@@  ");
            second.append("@   @ @   @ ");
            third.append("@    @    @ ");
            fourth.append("@         @ ");
            fifth.append(" @       @  ");
            sixth.append("  @     @   ");
            seventh.append("   @   @    ");
            eighth.append("    @ @     ");
            nineth.append("     @      ");
        }

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
        System.out.println(fourth.toString());
        System.out.println(fifth.toString());
        System.out.println(sixth.toString());
        System.out.println(seventh.toString());
        System.out.println(eighth.toString());
        System.out.println(nineth.toString());
    }
}
