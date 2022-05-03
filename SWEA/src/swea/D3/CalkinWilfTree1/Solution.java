package swea.D3.CalkinWilfTree1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int a;
    static int b;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        String str;
        char[] strArr;

        for (int t = 1; t <= T; t++) {
            a = 1;
            b = 1;
            str = br.readLine();

            for (int l = 0; l < str.length(); l++) {
                wilfTree(str.charAt(l));
            }
            
            sb.append("#").append(t).append(" ").append(a).append(" ").append(b).append("\n");
        }
        System.out.println(sb);
    }

    static void wilfTree(char direction) {
        if (direction == 'L') {
            b = a + b;
        } else {
            a = a + b;
        }
    }
}
