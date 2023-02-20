/*
 * BOJ 16435 스네이크버드
 *
 * memory : 14452kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P16435 {

    private static ArrayList<Integer> h;
    private static int n, l;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        h = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            h.add(Integer.parseInt(st.nextToken()));
        }
    }

    /**
     *  풀이의 핵심은 스네이크버드의 길이보다 작거나 같은 과일을 먼저 먹어야 하는 것이다.
     *  스네이크버드의 길이보다 작거나 같은 과일을 먼저 먹어야, 당장 현재 스네이크버드의 길이(l)보다
     *  높이가 커서 먹을 수 없던 과일들이 먹을 수 있는 과일이 되는지에 대한 여부가 결정된다.
     *  이를 위해 '정렬'이 필요하다.
     *
     *  1. 과일들의 높이를 ArrayList에 담은 후 오름차순으로 정렬한다.
     *     가장 낮은 높이의 과일이 리스트의 맨 앞에 있을 것이다.
     *
     *  2. 이를 스네이크버드의 길이(l)와 비교해서
     *     - 높이가 가장 낮은 과일이 먹을 수 있는 과일(l >= list.get(0))이면, ArrayList에서 맨 앞 원소를 제거하고, l을 +1 한다.
     *       ArrayList의 원소가 없다면(과일을 모두 먹었다면) 반복문을 종료하고 l을 출력한다.
     *     - 높이가 가장 낮은 과일이 먹을 수 없는 과일(l < list.get(0))이면 ArrayList가 오름차순으로 정렬되어 있는 상태이므로,
     *       이후의 과일(다음 원소들)도 못 먹는 것이 보장되므로 반복문을 종료하고 l을 출력한다.
     */
    private static void solve() {
        Collections.sort(h);

        while (!h.isEmpty()) {
            if (l >= h.get(0)) {
                h.remove(0);
                l++;
            } else {
                break;
            }
        }

        System.out.print(l);
    }
}
