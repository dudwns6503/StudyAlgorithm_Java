/*
 * BOJ 12891 DNA 비밀번호
 *
 * memory : 46020kb
 * time : 492ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P12891 {

    private static String str;
    private static Map<Character, Integer> rules;
    private static Map<Character, Integer> myRules;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        str = br.readLine();

        rules = new HashMap<>();
        myRules = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        rules.put('A', Integer.parseInt(st.nextToken()));
        rules.put('C', Integer.parseInt(st.nextToken()));
        rules.put('G', Integer.parseInt(st.nextToken()));
        rules.put('T', Integer.parseInt(st.nextToken()));

        myRules.put('A', 0);
        myRules.put('C', 0);
        myRules.put('G', 0);
        myRules.put('T', 0);

        for (int i = 0; i < p; i++) {
            char c = str.charAt(i);

            if (myRules.containsKey(c))
                myRules.put(c, myRules.get(c) + 1);
            else
                myRules.put(c, 1);
        }

        int ans = 0;
        if (check())
            ans++;

        int endIndex = p;
        for (int i = 0; i < s - p; i++) {
            char firstCharacter = str.charAt(i);

            myRules.put(firstCharacter, myRules.get(firstCharacter) - 1);

            char lastCharacter = str.charAt(endIndex);

            myRules.put(lastCharacter, myRules.get(lastCharacter) + 1);

            if (check())
                ans++;

            endIndex++;
        }

        System.out.print(ans);
    }

    private static boolean check() {
        int cnt = 0;

        if (myRules.get('A') >= rules.get('A'))
            cnt++;
        if (myRules.get('C') >= rules.get('C'))
            cnt++;
        if (myRules.get('G') >= rules.get('G'))
            cnt++;
        if (myRules.get('T') >= rules.get('T'))
            cnt++;

        return cnt == 4;
    }
}
