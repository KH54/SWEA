package swea.D3.구독자전쟁;

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
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (B > A) {
                int temp = B;
                B = A;
                A = temp;
            }

            int max = B;
            int min = 0;

            if (A + B >= N) {
                max = A + B > N / 2 ? B : A;
                min = A == B && B == N ? A : A + B > N ? A + B - N : 0;
            }

            sb.append("#").append(t).append(" ").append(max).append(" ").append(min).append("\n");
        }
        System.out.println(sb);
    }
}
