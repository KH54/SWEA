package swea.D2.쉬운거스름돈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append("\n");
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < arr.length; i++) {
                sb.append(N / arr[i]).append(" ");
                N = N % arr[i];
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
