package swea.D2.날짜계산기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] limit = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int T = Integer.parseInt(br.readLine());
        int[][] day;
        int sum;
        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");

            st = new StringTokenizer(br.readLine());

            sum = 0;
            day = new int[2][2];

            // 월일 입력
            day[0][0] = Integer.parseInt(st.nextToken());
            day[0][1] = Integer.parseInt(st.nextToken());
            day[1][0] = Integer.parseInt(st.nextToken());
            day[1][1] = Integer.parseInt(st.nextToken());

            // 달이 같은 경우
            if (day[0][0] == day[1][0]) {
                sum += day[1][1] - day[0][1] + 1;
            } else {
                // 첫달의 일 수
                sum += limit[day[0][0] - 1] - day[0][1] + 1;

                // 중간달의 일 수
                for (int i = day[0][0]; i < day[1][0] - 1; i++) {
                    sum += limit[i];
                }
                // 마지막 달의 일 수
                sum += day[1][1];
            }

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}
