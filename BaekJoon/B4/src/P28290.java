/*
 * BOJ 28290 안밖? 밖안? 계단? 역계단?
 *
 * memory : 14184kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28290 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if (str.equals("fdsajkl;") || str.equals("jkl;fdsa")) {
            System.out.print("in-out");
        } else if (str.equals("asdf;lkj") || str.equals(";lkjasdf")) {
            System.out.print("out-in");
        } else if (str.equals("asdfjkl;")) {
            System.out.print("stairs");
        } else if (str.equals(";lkjfdsa")) {
            System.out.print("reverse");
        } else {
            System.out.print("molu");
        }
    }
}
