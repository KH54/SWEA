package swea.D2.가랏RC카;

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
        int N;
        int speed;
        int distance;
        int acc;
        int control;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");

            N = Integer.parseInt(br.readLine());

            // 현재 속력
            speed = 0;
            // 현재 거리
            distance = 0;
            // 가속도
            acc = 0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                control = Integer.parseInt(st.nextToken());
                if (control != 0) {
                    acc = Integer.parseInt(st.nextToken());
                }

                if (control == 2 && speed < acc) {
                    speed = 0;
                } else {

                    switch (control) {
                    case 0:
                        break;
                    case 1:
                        speed += acc;
                        break;
                    case 2:
                        speed -= acc;
                        break;
                    }
                }
                distance += speed;
            }

            sb.append(distance).append("\n");
        }
        System.out.println(sb);
    }

}
