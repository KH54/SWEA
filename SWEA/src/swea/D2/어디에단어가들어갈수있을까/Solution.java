package swea.D2.어디에단어가들어갈수있을까;

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
        int[][] board;
        int count;
        int result = 0;

        for (int i = 0; i < T; i++) {
            sb.append("#").append(i + 1).append(" ");
            result = 0;

            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int row = 0;
            int col = 0;

            board = new int[N][N];

            // 보드 생성
            for (row = 0; row < N; row++) {
                st = new StringTokenizer(br.readLine());
                for (col = 0; col < N; col++) {
                    board[row][col] = Integer.parseInt(st.nextToken());
                }
            }

            for (row = 0; row < N; row++) {
                count = 0;
                for (col = 0; col < N; col++) {
                    if (board[row][col] == 0) {
                        if (count == K) {
                            result++;
                        }
                        count = 0;
                    } else {
                        count++;
                    }

                    if (col+1 == N) {
                        if (count == K) {
                            result++;
                        }
                    }
                }
            }

            for (col = 0; col < N; col++) {
                count = 0;
                for (row = 0; row < N; row++) {
                    if (board[row][col] == 0) {
                        if (count == K) {
                            result++;
                        }
                        count = 0;
                    } else {
                        count++;
                    }
                    
                    if(row+1 == N) {
                        if(count == K) {
                            result++;
                        }
                    }
                }
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}