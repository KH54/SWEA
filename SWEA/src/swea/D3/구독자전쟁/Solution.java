package swea.D3.구독자전쟁;

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

        for (int t = 1; t <= T; t++) {

            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int min = 0;
            int max = 0;

            // A가 3명 B가 5명
            if (A > B) {
                min = A - B;
                max = B;
            } else if (A < B) {
                min = B - A;
                max = A;
            } else {
                min = A;
                max = A;
            }
            sb.append("#").append(t).append(" ").append(max).append(" ").append(min).append("\n");
        }
        
        System.out.println(sb);
    }

}
