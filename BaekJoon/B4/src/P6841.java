/*
 * BOJ 6841 I Speak TXTMSG
 *
 * memory : 13964kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P6841 {

    private static Map<String, String> emoticons;

    public static void main(String[] args) throws Exception {
        init();
        input();
    }

    private static void init() {
        emoticons = new HashMap<>();

        emoticons.put("CU", "see you");
        emoticons.put(":-)", "I’m happy");
        emoticons.put(":-(", "I’m unhappy");
        emoticons.put(";-)", "wink");
        emoticons.put(":-P", "stick out my tongue");
        emoticons.put("(~.~)", "sleepy");
        emoticons.put("TA", "totally awesome");
        emoticons.put("CCC", "Canadian Computing Competition");
        emoticons.put("CUZ", "because");
        emoticons.put("TY", "thank-you");
        emoticons.put("YW", "you’re welcome");
        emoticons.put("TTYL", "talk to you later");
    }
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String emoticon = "";
        while ((emoticon = br.readLine()) != null) {
            System.out.println(emoticons.getOrDefault(emoticon, emoticon));
        }
    }
}
