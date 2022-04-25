package swea.D3.구구단1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());

            sb.append("#").append(t).append(" ").append(check(n) ? "Yes" : "No").append("\n");
        }
        
        System.out.println(sb);
    }

    static boolean check(int n) {

        if (n > 81) {
            return false;
        }

        if (n <= 10) {
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (n == i * j) {
                    return true;
                }
            }
        }

        return false;
    }
}
