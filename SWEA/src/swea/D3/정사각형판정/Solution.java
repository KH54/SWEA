package swea.D3.정사각형판정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int N;
        char[][] arr;
        String str;
        int length;
        int temp;
        boolean isSquare;

        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());

            arr = new char[N][N];

            for (int r = 0; r < N; r++) {
                str = br.readLine();
                for (int c = 0; c < N; c++) {
                    arr[r][c] = str.charAt(c);
                }
            }

            int row = 0;
            int col = 0;
            
            Outer : for(row = 0; row < N; row++) {
                for(col = 0 ; col < N; col++) {
                    if(arr[row][col] == '#') {
                        break Outer;
                    }
                }
            }
            
            length = 0;
            temp = row;
            
            while(temp < N) {
                if(arr[temp++][col] == '#') {
                    length++;
                } else {
                    break;
                }
            }
            
            isSquare = true;
            
            Outer : for(int i = 0 ; i  < N; i ++) {
                for(int j = 0 ; j < N; j++) {
                    if(i >= row && i <= row+length-1 && j >= col && j <= col+length-1) {
                        if(arr[i][j]=='.') {
                            isSquare = false;
                            break Outer;
                        }
                    } else {
                        if(arr[i][j]=='#') {
                            isSquare = false;
                            break Outer;
                        }
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(isSquare ? "yes" : "no").append("\n");
        }
        System.out.println(sb);

    }

}
