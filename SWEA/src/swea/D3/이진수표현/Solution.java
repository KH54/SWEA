package swea.D3.이진수표현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            String M = Integer.toBinaryString(Integer.parseInt(st.nextToken()));

            String str = "ON";
            if (M.length() < N) {
                str = "OFF";
            } else {
                for (int i = M.length() - 1; i >= M.length() - N; i--) {
                    if (M.charAt(i) == '0') {
                        str = "OFF";
                        break;
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(str).append("\n");
        }

        System.out.println(sb);
    }

}
