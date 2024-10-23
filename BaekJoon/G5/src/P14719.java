/*
 * BOJ 14719 빗물
 *
 * memory : 14388kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14719 {

    private static int[] heights;
    private static int h, w;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        // 블록의 높이
        int left = 0;
        int right = 0;

        // 블록의 좌표
        int leftX = 0;
        int rightX = 0;
        int ans = 0;

        for (int i = 0; i < heights.length; i++) {
            // 왼쪽 블록의 높이를 지정한다.
            if (left == 0 && heights[i] != 0) {
                left = heights[i];
                leftX = i;
                continue;
            }

            // 오른쪽 블록의 높이를 지정한다.
            if (right == 0 && heights[i] != 0) {
                right = heights[i];
                rightX = i;
            }

            // 왼쪽 블록과 오른쪽 블록의 높이가 지정되었으면
            // 그 사이의 값들과 블록의 높이를 비교해서 ans에 더해준다.
            if (left != 0 && right != 0) {
                for (int j = leftX + 1; j < rightX; j++) {
                    ans += Math.max(Math.min(left, right) - heights[j], 0);
                    heights[j] += Math.max(Math.min(left, right) - heights[j], 0);
                }
            }

            // 오른쪽 블록의 높이가 더 크거나 같다면 오른쪽 블록 값을 왼쪽 블록에 넣어준다.
            if (left <= right) {
                left = right;
                leftX = rightX;
            }

            right = 0;
            rightX = 0;
        }

        System.out.print(ans);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        heights = new int[w];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < w; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }
    }
}
