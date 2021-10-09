/*
 * BOJ 10699 오늘 날짜
 */

import java.util.*;
import java.text.SimpleDateFormat;

public class P10699 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();

        System.out.print(format.format(date));
    }
}
