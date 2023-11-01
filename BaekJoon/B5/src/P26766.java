/*
 * BOJ 26766 Serca
 *
 * memory : 23860kb
 * time : 948ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26766 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            print();
        }
    }

    private static void print() {
        System.out.println(" @@@   @@@ \n" +
                "@   @ @   @\n" +
                "@    @    @\n" +
                "@         @\n" +
                " @       @ \n" +
                "  @     @  \n" +
                "   @   @   \n" +
                "    @ @    \n" +
                "     @     ");
    }

}
