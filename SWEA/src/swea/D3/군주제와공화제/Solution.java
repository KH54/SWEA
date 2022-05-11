package swea.D3.군주제와공화제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[][] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            arr = new int[N][N + 1];

            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());

                arr[n][0] = Integer.parseInt(st.nextToken());
                arr[n][1] = Integer.parseInt(st.nextToken());
                arr[n][2] = Integer.parseInt(st.nextToken());
            }

        }
    }
}
