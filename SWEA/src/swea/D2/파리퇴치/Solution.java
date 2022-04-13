package swea.D2.파리퇴치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int N;
        int M;
        int[][] arr;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            sb.append("#").append(i + 1).append(" ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N][N];

            arr = Board(arr);

            sb.append(Kill(arr, M)).append("\n");
        }
        System.out.println(sb);
    }

    static int[][] Board(int[][] arr) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        return arr;
    }

    static int Kill(int[][] arr, int M) {
        int max = Integer.MIN_VALUE;
        int temp;

        for (int i = 0; i <= arr.length - M; i++) {
            for (int j = 0; j <= arr.length - M; j++) {
                temp = 0;
                for (int k = 0; k < M; k++) {
                    for (int l = 0; l < M; l++) {
                        temp += arr[i + k][j + l];
                    }
                }
                if (max < temp) {
                    max = temp;
                }
            }
        }

        return max;
    }
}
