/*
 * BOJ 18108 1998년생인 내가 태국에서는 2541년생?!
 *
 * memory : 14260kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P18108 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        year -= 543;

        bw.write(year + "");
        bw.flush();
        bw.close();
    }
}
