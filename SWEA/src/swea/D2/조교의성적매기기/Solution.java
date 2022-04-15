package swea.D2.조교의성적매기기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] grade = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append("#").append(i + 1).append(" ");
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int rank = 0;
            double sum;
            Double arr[] = new Double[N];
            Double temp[] = new Double[N];

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                sum = Double.parseDouble(st.nextToken()) * 35;
                sum += Double.parseDouble(st.nextToken()) * 45;
                sum += Double.parseDouble(st.nextToken()) * 20;

                arr[j] = sum;
                temp[j] = sum;
            }

            Arrays.sort(temp, Collections.reverseOrder());

            for (int k = 0; k < N; k++) {
                if (Double.compare(arr[K - 1], temp[k]) == 0) {
                    rank = k;
                    break;
                }
            }

            sb.append(grade[rank/(N/10)]).append("\n");
        }

        System.out.println(sb);
    }
}
