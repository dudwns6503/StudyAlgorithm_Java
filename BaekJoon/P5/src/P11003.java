/*
 * BOJ 11003 최솟값 찾기
 *
 * memory : 621168kb
 * time : 2456ms
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P11003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Deque<Node> deque = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && deque.getLast().number > num) {
                deque.pollLast();
            }

            deque.addLast(new Node(i, num));

            if (deque.getFirst().index <= i - l)
                deque.pollFirst();

            bw.write(deque.getFirst().number + " ");
        }

        bw.flush();
        bw.close();
    }

    static class Node implements Comparable<Node> {
        int index;
        int number;

        public Node(int index, int number) {
            this.index = index;
            this.number = number;
        }

        @Override
        public int compareTo(Node other) {
            return this.number - other.number;
        }
    }
}