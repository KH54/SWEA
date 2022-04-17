package swea.D2.스도쿠검증;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        int[][] arr;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");

            arr = new int[10][10];

            // 생성
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            check(arr);
        }
        System.out.println(sb);
    }

    static void check(int[][] arr) {
        HashMap<Integer, Integer> map;
        int result = 0;

        for (int i = 0; i < 9; i++) {
            map = new HashMap<>();

            for (int j = 0; j < 9; j++) {
                map.put(arr[i][j], j);
            }

            if (map.size() == 9) {
                result++;
            }
        }

        for (int i = 0; i < 9; i++) {
            map = new HashMap<>();

            for (int j = 0; j < 9; j++) {
                map.put(arr[j][i], j);
            }

            if (map.size() == 9) {
                result++;
            }
        }

        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                map = new HashMap<>();

                int row = i + 3;
                int col = j + 3;
                int count = 0;

                for (int a = i; a < row; a++) {
                    for (int b = j; b < col; b++) {
                        map.put(arr[a][b], count);
                        count++;
                    }
                }

                if (map.size() == 9) {
                    result++;
                }
            }
        }

        if (result == 27) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }

    }
}
