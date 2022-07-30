/*
 * BOJ 22252 정보 상인 호석
 *
 * memory : 121356kb
 * time : 1032ms
 */

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P22252 {

    static FastReader fr = new FastReader();

    static PriorityQueue<Integer>[] info;
    static HashMap<String, Integer> name_map;
    static int Q, pid_cnt;

    static void input() {
        Q = fr.nextInt();
        name_map = new HashMap<>();
        info = new PriorityQueue[100005];
    }

    // 이름을 숫자로 변환
    static int get_pid(String name) {
        if(!name_map.containsKey(name)) {
            name_map.put(name, ++pid_cnt);
            info[pid_cnt] = new PriorityQueue<>(Comparator.reverseOrder());
        }

        return name_map.get(name);
    }

    static void pro() {
        long ans = 0;

        while(Q-- > 0) {
            int query = fr.nextInt();
            String name = fr.next();
            int pid = get_pid(name);

            if(query == 1) {
                int k = fr.nextInt();

                while(k-- > 0) {
                    info[pid].add(fr.nextInt());
                }
            }
            else {
                int b = fr.nextInt();
                while(b-- > 0 && !info[pid].isEmpty()) {
                    ans += info[pid].poll();
                }
            }
        }

        System.out.print(ans);
    }

    public static void main(String[] args) {
        input();
        pro();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
