/*
 * BOJ 17863 FYI
 *
 * memory : 14192kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17863 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        if(number.startsWith("555"))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
