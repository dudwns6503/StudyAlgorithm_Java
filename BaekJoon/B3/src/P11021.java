/*
BaekJoon 11021 A+B-7
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11021 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int test_case=1; test_case<=T; test_case++) {
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            answer = a + b;
            bw.write("Case #" + String.valueOf(test_case) + ": " + String.valueOf(answer));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
