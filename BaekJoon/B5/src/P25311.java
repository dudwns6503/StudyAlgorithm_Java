/*
 * BOJ 25311 UCPC에서 가장 쉬운 문제 번호는?
 *
 * memory : 14032kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P25311 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        bw.write('A');
        bw.flush();
        bw.close();
        br.close();
    }
}
