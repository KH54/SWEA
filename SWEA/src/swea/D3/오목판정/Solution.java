package swea.D3.오목판정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static char[][] board;
    static int[][] move = { { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
    static int N;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {

            N = Integer.parseInt(br.readLine());

            board = new char[N][N];

            // 보드 생성
            for (int r = 0; r < N; r++) {
                String str = br.readLine();
                for (int c = 0; c < N; c++) {
                    board[r][c] = str.charAt(c);
                }
            }
            String answer = "NO";

            stone: for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (board[r][c] == 'o') {
                        for (int find = 0; find < 4; find++) {
                            int count = count(r, c, find);
                            if (count == 5) {
                                answer = "YES";
                                break stone;
                            }
                        }
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }

    static int count(int r, int c, int find) {
        int cnt = 1;
        int dx = r;
        int dy = c;

        for (int game = 0; game < 4; game++) {
            dx = dx + move[find][0];
            dy = dy + move[find][1];

            if (dx >= 0 && dx < N && dy >= 0 && dy < N && board[dx][dy] == 'o') {
                cnt++;
            } else {
                break;
            }
        }

        return cnt;
    }
}
