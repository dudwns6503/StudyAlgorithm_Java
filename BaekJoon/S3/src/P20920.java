/*
 * BOJ 20920 영단어 암기는 괴로워
 *
 * memory : 41920kb
 * time : 796ms
 */


import java.io.*;
import java.util.*;

public class P20920 {

    private static final ArrayList<Word> list = new ArrayList<>();
    private static final HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            if (word.length() < m) continue;

            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
    }

    private static void solve() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String word : map.keySet()) {
            int cnt = map.get(word);
            list.add(new Word(cnt, word));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                bw.write(list.get(i).alpha + "\n");
            } else {
                bw.write(list.get(i).alpha);
            }
        }

        bw.flush();
        bw.close();
    }

    static class Word implements Comparable<Word> {

        public int frequency;
        public int length;
        public String alpha;

        public Word(int frequency, String word) {
            this.frequency = frequency;
            this.length = word.length();
            this.alpha = word;
        }

        @Override
        public int compareTo(Word other) {
            if (this.frequency != other.frequency) {
                return other.frequency - this.frequency;
            }

            if (this.length != other.length) {
                return other.length - this.length;
            }

            return this.alpha.compareTo(other.alpha);
        }
    }
}
