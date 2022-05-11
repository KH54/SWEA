package swea.D3.다트게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int point = 0;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                x *= x;
                y *= y;

                double r = x + y;
                r = 200;

                if (r <= 200) {
                    if(r % 20 == 0) {
                        r = r -1;
                    }
                    point += arr[(int) r / 20];
                    System.out.println(point);
                }
            }
            sb.append("#").append(t).append(" ").append(point).append("\n");
        }
        System.out.println(sb);
    }

}
