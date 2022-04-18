package swea.D2.달팽이숫자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int[][] arr;
    static int count;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int N;
        int count;
        int r;
        int c;

        int num;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append("\n");

            N = Integer.parseInt(br.readLine());

            count = N - 1;
            r = 0;
            c = 0;
            num = 1;
            arr = new int[N][N];
            
            arr[0][0] = 1;

            while (true) {
                if (num == N * N) {
                    break;
                }

                // 첫줄
                if (num == 1) {
                    for (int i = 0; i < count; i++) {
                        arr[r][++c] = ++num;
                    }
                }

                // 아래쪽
                for (int i = 0; i < count; i++) {
                    arr[++r][c] = ++num;
                }

                // 왼쪽
                for (int i = 0; i < count; i++) {
                    arr[r][--c] = ++num;

                }
                count--;
                // 위쪽
                for (int i = 0; i < count; i++) {
                    arr[--r][c] = ++num;
                }

                // 오른쪽
                for (int i = 0; i < count; i++) {
                    arr[r][++c] = ++num;

                }
                count--;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
