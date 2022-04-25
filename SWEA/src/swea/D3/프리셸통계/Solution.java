package swea.D3.프리셸통계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        boolean result;

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());

            result = true;

            double N = Integer.parseInt(st.nextToken());
            int pd = Integer.parseInt(st.nextToken());
            int pg = Integer.parseInt(st.nextToken());

            if (pd > 0 && pg == 0) {
                result = false;
            } else if (pd < 100 && pg == 100) {
                result = false;
            }

            sb.append("#").append(t).append(" ").append(result ? "Possible" : "Broken").append("\n");
        }
        System.out.println(sb);
    }

}
