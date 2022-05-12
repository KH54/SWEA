package swea.D3.제곱수만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int A = Integer.parseInt(br.readLine());

            sb.append("#").append(t).append(" ").append(prime(A)).append("\n");
        }
        System.out.println(sb);
    }

    private static int prime(int n) {

        int result = 1;

        if (n < 4) {
            return n;
        }

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                n /= i;
                result *= i;
            }

            while (result % i == 0) {
                result /= i;
            }

        }

        return result == 0 ? n : result;
    }

}
