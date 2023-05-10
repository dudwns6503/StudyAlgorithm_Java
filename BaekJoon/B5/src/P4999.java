 /*
  * BOJ 4999 아!
  *
  * memory : 14232kb
  * time : 128ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4999 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String user = br.readLine();
        String doctor = br.readLine();

        solve(user, doctor);
    }

    private static void solve(String user, String doctor) {
        if (user.contains(doctor)) System.out.print("go");
        else System.out.print("no");
    }
}
