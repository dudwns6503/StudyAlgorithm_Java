/*
 * BOJ 29097 Короли
 *
 * memory : 14288kb
 * time : 112ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P29097 {

    private static int n, m, k, a, b, c;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        Army joffreyArmy = new Army("Joffrey", a*n);
        Army robbArmy = new Army("Robb", b * m);
        Army stannisArmy = new Army("Stannis", c*k);

        Army[] armies = new Army[]{joffreyArmy, robbArmy, stannisArmy};
        Arrays.sort(armies);

        int prevPersonCnt = armies[0].personCnt;
        System.out.print(armies[0].kingName + " ");
        for (int i = 1; i <= 2; i++) {
            if (prevPersonCnt != armies[i].personCnt)
                break;

            System.out.print(armies[i].kingName + " ");
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    static class Army implements Comparable<Army> {
        public String kingName;
        public int personCnt;

        public Army(String kingName, int personCnt) {
            this.kingName = kingName;
            this.personCnt = personCnt;
        }

        @Override
        public int compareTo(Army o) {
            if (personCnt == o.personCnt)
                return kingName.compareTo(o.kingName);

            return o.personCnt - this.personCnt;
        }
    }
}
