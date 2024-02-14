/*
 * BOJ 16600 Contemporary Art
 *
 * memory : 14280kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P16600 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double area = Double.parseDouble(br.readLine());
        System.out.print(Math.sqrt(area) * 4);
    }
}
