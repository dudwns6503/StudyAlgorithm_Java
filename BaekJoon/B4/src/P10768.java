/*
 * BOJ 10768 특별한 날
 *
 * memory : 18300kb
 * time : 260ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class P10768 {

    private static int month, day;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        month = Integer.parseInt(br.readLine());
        day = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        Calendar criteria = new GregorianCalendar();
        criteria.set(2015, 2, 18);

        Calendar current = new GregorianCalendar();
        current.set(2015, month, day);

        if (current.before(criteria)) {
            System.out.print("Before");
        } else if (current.after(criteria)) {
            System.out.print("After");
        } else {
            System.out.print("Special");
        }
    }
}
