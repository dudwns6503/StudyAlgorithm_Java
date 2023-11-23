/*
 * BOJ 30676 이 별은 무슨 색일까
 *
 * memory : 14168kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30676 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        if (l < 425)
            System.out.print("Violet");
        else if (l < 450)
            System.out.print("Indigo");
        else if (l < 495)
            System.out.print("Blue");
        else if (l < 570)
            System.out.print("Green");
        else if (l < 590)
            System.out.print("Yellow");
        else if (l < 620)
            System.out.print("Orange");
        else
            System.out.print("Red");
    }
}
