/*
 * BOJ 30664 Loteria Falha
 *
 * memory : 14360kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P30664 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger divisor = new BigInteger("42");
        while (true) {
            String str = br.readLine();

            if (str.equals("0")) break;

            BigInteger number = new BigInteger(str);

            if (number.mod(divisor).equals(BigInteger.ZERO))
                System.out.println("PREMIADO");
            else
                System.out.println("TENTE NOVAMENTE");
        }
    }
}
