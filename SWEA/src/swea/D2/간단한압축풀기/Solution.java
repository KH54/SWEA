package swea.D2.간단한압축풀기;

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
        int N;

        String str;
        int count;
        int width;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append("\n");

            width = 0;
            N = Integer.parseInt(br.readLine());

            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());

                str = st.nextToken();
                count = Integer.parseInt(st.nextToken());

                for (int i = 0; i < count; i++) {
                    sb.append(str);
                    width++;

                    if (width % 10 == 0) {
                        sb.append("\n");
                    }
                }

            }

            sb.append("\n");
        }

        System.out.println(sb);
    }

}
