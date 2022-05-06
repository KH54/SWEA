package swea.D3.소득불균형;

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
            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine());

            int sum = 0;
            for (int n = 0; n < N; n++) {
                arr[n] = Integer.parseInt(st.nextToken());
                sum += arr[n];
            }

            int count = 0;

            for (int n = 0; n < N; n++) {
                if (arr[n] <= (sum / N)) {
                    count++;
                }
            }

            sb.append("#").append(t).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }

}
