package swea.D3.최고의쌍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            arr = new int[N];

            for (int n = 0; n < N; n++) {
                arr[n] = Integer.parseInt(st.nextToken());
            }

            int best = -1;
            int num;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        continue;
                    }
                    num = arr[i] * arr[j];

                    if (best < num && best < check(num)) {
                        best = num;
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(best).append("\n");
        }
        System.out.println(sb);
    }

    private static int check(int num) {
        int before = -1;
        int now = -1;
        int result = num;

        if (num < 10) {
            return num;
        } else {
            before = num % 10;
            num /= 10;
            while (num != 0) {
                now = num % 10;
                num /= 10;

                if (before - 1 != now) {
                    return -1;
                }

                before = now;
            }
            return result;
        }
    }

}
