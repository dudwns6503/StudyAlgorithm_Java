 /*
  * BOJ 10867 중복 빼고 정렬하기
  *
  * memory : 25168kb
  * time : 380ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P10867 {

    private static TreeSet<Integer> treeSet;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        treeSet = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            treeSet.add(Integer.parseInt(st.nextToken()));
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for (Integer num : treeSet) {
            sb.append(num).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
