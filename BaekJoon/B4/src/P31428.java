/*
 * BOJ 31428 엘리스 트랙 매칭
 *
 * memory : 15428kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P31428 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String className = st.nextToken();

            if (map.containsKey(className))
                map.put(className, map.get(className) + 1);
            else
                map.put(className, 1);
        }

        String myClass = br.readLine();

        if (!map.containsKey(myClass))
            System.out.print("0");
        else
            System.out.print(map.get(myClass));
    }
}
