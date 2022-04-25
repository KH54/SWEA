package swea.D3.교환학생;

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

        for (int t = 1; t <= T; t++) {

            double n = Integer.parseInt(br.readLine());
            int[] arr = new int[7];

            // 일주일 중 수업 일 수
            double point = 0;

            int nCount = 0;
            int day = 0;
            int middle = 0;

            boolean end = false;

            st = new StringTokenizer(br.readLine());
            for (int d = 0; d < arr.length; d++) {
                arr[d] = Integer.parseInt(st.nextToken());

                if (arr[d] == 1) {
                    point++;
                    nCount++;
                }

                if (point > 0) {
                    day++;
                }

                if (n == nCount) {
                    sb.append("#").append(t).append(" ").append(day);
                    end = true;
                    break;
                }
            }

            if (!end) {
                if (day >= 7) {
                    day += Math.ceil(((n - (point*2)) / point) * 7);
                    nCount += n - (point*2);
                }
                outer: while (n != nCount) {
                    for (int d = 0; d < arr.length; d++) {

                        if (arr[d] == 1) {
                            nCount++;
                        }
                        day++;

                        if (n == nCount) {
                            break outer;
                        }
                    }
                }
                sb.append("#").append(t).append(" ").append(day).append("\n");
            }
        }
        System.out.println(sb);
    }
}
