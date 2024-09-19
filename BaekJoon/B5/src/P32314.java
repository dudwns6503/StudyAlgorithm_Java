/*
 * BOJ 32314 Christmas Tree Adapter
 *
 * memory : 14292kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32314 {
    
    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
    
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int treeAmpere = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int treeWatt = Integer.parseInt(st.nextToken());
        int treeVolt = Integer.parseInt(st.nextToken());

        if (treeAmpere > treeWatt / treeVolt)
            System.out.print("0");
        else
            System.out.print("1");
    }
}
