/*
 * BOJ 29731 2033년 밈 투표
 *
 * memory : 14108kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P29731 {

    private static Set<String> set;
    private static int n;


    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        set = new HashSet<>();

        setInit();

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            String pledge = br.readLine();
            if (isNotPresentPledge(pledge)) flag = true;
        }

        if (flag) System.out.print("Yes");
        else System.out.print("No");
    }

    private static void setInit() {
        set.add("Never gonna give you up");
        set.add("Never gonna let you down");
        set.add("Never gonna run around and desert you");
        set.add("Never gonna make you cry");
        set.add("Never gonna say goodbye");
        set.add("Never gonna tell a lie and hurt you");
        set.add("Never gonna stop");
    }

    private static boolean isNotPresentPledge(String pledge) {
        // 공약에 포함되지 않는다면 true 출력
        return !set.contains(pledge);
    }
}
