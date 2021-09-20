/*
BaekJoon 13277

BigInteger를 활용해야 하는 문제이다.
*/

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class P13277 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        String str2 = st.nextToken();
        BigInteger bigInteger1 = new BigInteger(str);
        BigInteger bigInteger2 = new BigInteger(str2);

        System.out.print(bigInteger1.multiply(bigInteger2));
    }
}