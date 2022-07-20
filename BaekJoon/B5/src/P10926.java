/*
 * BOJ 10926 ??!
 *
 * memory : 14276kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10926 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append(str).append("??!");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
