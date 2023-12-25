/*
 * BOJ 30402 감마선을 맞은 컴퓨터
 *
 * memory : 14236kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30402 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            String picture = br.readLine();

            if (picture.contains("w")) {
                System.out.print("chunbae");
                break;
            } else if (picture.contains("b")) {
                System.out.print("nabi");
                break;
            } else if (picture.contains("g")){
                System.out.print("yeongcheol");
                break;
            }
        }
    }
}
