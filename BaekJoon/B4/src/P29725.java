/*
 * BOJ 29725 체스 초보 브실이
 *
 * memory : 14268kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P29725 {

    private static String[] chessBoard;
    private static int sum;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        chessBoard = new String[8];
        for (int i = 0; i < 8; i++) {
            chessBoard[i] = br.readLine();
        }

        readObjects();
    }

    private static void readObjects() {
        sum = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char object = chessBoard[i].charAt(j);

                solve(object);
            }
        }

        System.out.print(sum);
    }

    private static void solve(char object) {
        if (object == '.') return;

        String strObject = String.valueOf(object);

        // 대문자 +, 소문자 -
        if ((int) object >= 65 && (int) object <= 90) {
            sum += pieceType(strObject);
        } else {
            sum -= pieceType(strObject);
        }
    }

    private static int pieceType(String object) {
        if (object.equalsIgnoreCase("K")) return 0;
        else if (object.equalsIgnoreCase("P")) return 1;
        else if (object.equalsIgnoreCase("N") || object.equalsIgnoreCase("B")) return 3;
        else if (object.equalsIgnoreCase("R")) return 5;
        else return 9;
    }
}
