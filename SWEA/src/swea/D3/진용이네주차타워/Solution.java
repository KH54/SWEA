package swea.D3.진용이네주차타워;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());

            int[][] Ri = new int[n][2];
            int[] Wi = new int[m];

            for (int r = 0; r < n; r++) {
                Ri[r][0] = Integer.parseInt(br.readLine());
            }

            for (int w = 0; w < m; w++) {
                Wi[w] = Integer.parseInt(br.readLine());
            }

            Queue<Integer> queue = new LinkedList<>();

            int cost = 0;
            int count = 0;
            int num = Integer.parseInt(br.readLine());

            for (int i = 0; i < m * 2; i++) {
                if (num > 0) {
                    for (int r = 0; r < n; r++) {
                        if (Ri[r][1] == 0) {
                            Ri[r][1] = num;
                            break;
                        }
                    }
                } else {
                    for(int r = 0; r< n; r++) {
                        if(Ri[r][1] == num) {
                            Ri[r][1] = 0;
                            break;
                        }
                    }
                }
            }

        }
    }

}
