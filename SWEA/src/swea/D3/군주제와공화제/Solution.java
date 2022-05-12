package swea.D3.군주제와공화제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static double[][] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            arr = new double[N][6];

            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());

                arr[n][0] = Integer.parseInt(st.nextToken());
                arr[n][1] = Integer.parseInt(st.nextToken());
                arr[n][2] = Integer.parseInt(st.nextToken());
                arr[n][4] = -1;
            }

            for (int i = 0; i < N; i++) {
                control(i);
            }
            String result = "";

            for (int i = 0; i < N; i++) {
                // 군주제
                if (arr[i][4] == -1) {
                    result += "K ";
                } else if (arr[i][3] == 1) {
                    result += "D ";
                } else if (arr[i][3] > 1) {
                    result += "D ";
                }
            }
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    static void control(int n) {

        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                continue;
            } else {
                double x = Math.pow(arr[i][0] - arr[n][0], 2);
                double y = Math.pow(arr[i][1] - arr[n][1], 2);
                // 영향력
                double power = arr[n][2] / (x + y);

                if (power > arr[i][2]) {
                    arr[i][3] = 1;
                    arr[i][4] = power;
                    arr[i][5] = n;
                }
                if (power == arr[i][4]) {
                    arr[i][3]++;
                    arr[i][4] = power;
                    arr[i][5] = 0;
                }

            }
        }
    }

}
