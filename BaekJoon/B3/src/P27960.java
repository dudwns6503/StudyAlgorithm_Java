/*
 * BOJ 27960 사격 내기
 *
 * memory : 14284kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P27960 {

    /**
     *  treeMap: Key (과녁의 점수), Value (맞춘 사람의 수)
     *  scores: 10개의 점수
     */
    private static TreeMap<Integer, Integer> treeMap;
    private static int[] scores = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        init();

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    // TreeMap을 생성하고, Key를 각 점수로, Value를 0으로 put한다.
    // TreeMap이므로 오름차순으로 정렬된다.
    private static void init() {
        treeMap = new TreeMap<>();

        for (int i = 0; i <= 9; i++) {
            treeMap.put(scores[i], 0);
        }
    }

    private static void solve() {
        int aIndex = 9;
        int bIndex = 9;
        int aSum = 0;
        int bSum = 0;
        int c = 0;

        /**
         *  aIndex는 scores의 높은 점수부터 탐색하도록 만들었는데,
         *  scores[aIndex](높은 점수)의 값이 a보다 크다면 scores[i]는 a가 쏜 점수가 아니므로
         *  aIndex의 값을 -1 한다.
         */
        while (true) {
            if (aIndex == -1) {
                aIndex = 0;
                break;
            }

            if (scores[aIndex] > a) aIndex--;
            else break;
        }

        // a와 동일
        while (true) {
            if (bIndex == -1) {
                bIndex = 0;
                break;
            }

            if (scores[bIndex] > b) bIndex--;
            else break;
        }

        // aIndex부터 0까지(높은 점수부터 낮은 점수까지) 탐색하면서
        // aSum에 scores[i]를 더한 값이
        // a보다 작거나 같다면 값을 포함하고, treeMap(scores[i])의 1을 put 한다.
        for (int i = aIndex; i >= 0; i--) {
            if (aSum + scores[i] <= a) {
                aSum += scores[i];
                treeMap.put(scores[i], 1);
            }
        }

        // a와 나머지는 동일한데, put의 value만 주의한다.
        for (int i = bIndex; i >= 0; i--) {
            if (bSum + scores[i] <= b) {
                bSum += scores[i];
                treeMap.put(scores[i], treeMap.get(scores[i]) + 1);
            }
        }

        // 한 명만 쏜 과녁의 key만 c의 점수로 합산한다.
        for (Integer key : treeMap.keySet()) {
            if (treeMap.get(key) == 1) {
                c += key;
            }
        }

        System.out.print(c);
    }
}
