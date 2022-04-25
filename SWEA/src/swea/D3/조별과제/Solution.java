package swea.D3.조별과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int N;
        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());
            
            sb.append("#").append(t).append(" ").append(N/3).append("\n");
        }
        System.out.println(sb);
    }

}
