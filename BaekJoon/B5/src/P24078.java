/*
 * BOJ 24078 余り (Remainder)
 *
 * memory : 14204kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P24078 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int answer = x % 21;

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
