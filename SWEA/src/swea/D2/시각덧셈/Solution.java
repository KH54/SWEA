package swea.D2.시각덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int H;
        int M;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            H = 0;
            M = 0;
            st = new StringTokenizer(br.readLine());

            H += Integer.parseInt(st.nextToken());
            M += Integer.parseInt(st.nextToken());
            H += Integer.parseInt(st.nextToken());
            M += Integer.parseInt(st.nextToken());

            H = ((M / 60) + H) % 12 == 0 ? 12 : ((M / 60) + H) % 12;
            M %= 60;

            sb.append(H).append(" ").append(M).append("\n");
        }
        System.out.println(sb);
    }
}
