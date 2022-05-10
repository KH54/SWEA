package swea.D3.무한사전;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        String P;
        String Q;
        for (int t = 1; t <= T; t++) {

            P = br.readLine() + "a";
            Q = br.readLine();

            String result = "";

            if (P.equals(Q)) {
                result = "N";
            } else {
                result = "Y";
            }

            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

}
