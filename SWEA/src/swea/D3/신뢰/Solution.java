package swea.D3.신뢰;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());

            int orangeLocation = 1;
            int orangeTime = 0;

            int blueLocation = 1;
            int blueTime = 0;

            int resultTime = 0;

            int N = Integer.parseInt(st.nextToken());

            for (int i = 0; i < N; i++) {
                String robot = st.nextToken();
                int waste = Integer.parseInt(st.nextToken());

                // 로봇 Blue가 움직이는 경우
                if (robot.equals("B")) {

                    // 로봇 Orange가 움직이는경우
                } else {

                }
            }

        }
    }

}
