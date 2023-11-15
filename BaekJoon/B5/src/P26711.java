/*
 * BOJ 26711 A+B
 *
 * memory : 15620kb
 * time : 192ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P26711 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        System.out.print(a.add(b));
    }
}
