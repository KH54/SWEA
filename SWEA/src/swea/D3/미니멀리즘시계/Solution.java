package swea.D3.미니멀리즘시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int radi = Integer.parseInt(br.readLine()) * 2;

            int h = radi / 60;
            int m = radi - h * 60;
            
            sb.append("#").append(t).append(" ").append(h == 12 ? 0 : h).append(" ").append(m).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }

}
