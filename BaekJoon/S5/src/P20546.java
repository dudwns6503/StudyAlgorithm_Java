/*
 * BOJ 20546 🐜 기적의 매매법 🐜
 *
 * memory : 14156kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20546 {

    private static int[] stockPrices;
    private static int money;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        // 준현, 성민
        int jhCash = money;
        int smCash = money;

        int jhStock = 0;
        int smStock = 0;

        // 성민 전용 주가 상승, 하락, 저장 변수
        int up = 0;
        int down = 0;

        // 준현 먼저 계산
        for (int i = 0; i < stockPrices.length; i++) {
            // 준현 로직
            if (stockPrices[i] <= jhCash) {
                int count = jhCash / stockPrices[i];
                jhStock += count;
                jhCash -= (stockPrices[i] * count);
            }

            // 성민 로직
            up = 0;
            down = 0;
            for (int j = 1; j <= 2; j++) {
                if (i - 3 < 0)
                    break;

                if (stockPrices[i - j] > stockPrices[i - (j + 1)]) {
                    up++;
                } else if (stockPrices[i - j] < stockPrices[i - (j + 1)]) {
                    down++;
                }
            }

            // 매도
            if (up == 2) {
                smCash += stockPrices[i] * smStock;
                smStock = 0;
            }
            // 매수
            else if (down == 2) {
                if (stockPrices[i] <= smCash) {
                    int count = smCash / stockPrices[i];
                    smStock += count;
                    smCash -= (stockPrices[i] * count);
                }
            }
        }

        int jhProperty = jhCash + stockPrices[13] * jhStock;
        int smProperty = smCash + stockPrices[13] * smStock;

        if (jhProperty > smProperty)
            System.out.print("BNP");
        else if (jhProperty < smProperty)
            System.out.print("TIMING");
        else
            System.out.print("SAMESAME");
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        stockPrices = new int[14];
        money = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            stockPrices[i] = Integer.parseInt(st.nextToken());
        }
    }
}
