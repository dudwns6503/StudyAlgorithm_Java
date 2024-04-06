/*
 * BOJ 31746 SciComLove (2024)
 *
 * memory : 14168kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31746 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0) {
            System.out.print("SciComLove");
        } else {
            System.out.print("evoLmoCicS");
        }
    }
}
