package swea.D2.숫자배열회전;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int N;
        int[][] arr;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append("\n");

            N = Integer.parseInt(br.readLine());
            arr = new int[N][N];

            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; c++) {
                    arr[r][c] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] first = angle(arr);
            int[][] second = angle(first);
            int[][] third = angle(second);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(first[i][j]);
                }
                sb.append(" ");

                for (int j = 0; j < N; j++) {
                    sb.append(second[i][j]);
                }
                sb.append(" ");

                for (int j = 0; j < N; j++) {
                    sb.append(third[i][j]);
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }

    static int[][] angle(int[][] arr) {
        int[][] result = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[arr.length - j - 1][i];
            }
        }
        return result;
    }
}
