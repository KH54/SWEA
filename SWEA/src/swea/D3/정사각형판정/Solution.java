package swea.D3.정사각형판정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int N;
        int[][] arr;
        boolean[][] temp;
        String str;
        boolean result = false;

        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());

            arr = new int[N][N];
            temp = new boolean[N][N];

            for (int r = 0; r < N; r++) {
                str = br.readLine();
                for (int c = 0; c < N; c++) {
                    arr[r][c] = str.charAt(c);
                }
            }

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (arr[r][c] == 35) {
                        temp[r][c] = true;
                    }
                }
            }
            
            System.out.println(Arrays.deepToString(temp));
        }
    }

}
