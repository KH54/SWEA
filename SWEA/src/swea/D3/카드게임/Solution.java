package swea.D3.카드게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 4;
        }

        arr[8] = 16;

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int sum = 0;

            for (int n = 0; n < N; n++) {
                int num = Integer.parseInt(br.readLine());

                if (num == 10) {
                    arr[8] += -1;
                } else if (num == 11) {
                    arr[9] += -1;
                } else {
                    arr[num - 2] += -1;
                }
                sum += num;
            }

            int over = 0;

            for (int i = 2; i < 10; i++) {
                if (sum + i > 21) {
                    over += arr[i - 2];
                }
            }

            if (sum + 10 > 21) {
                over += arr[8];
            }

            if (sum + 11 > 21) {
                over += arr[9];
            }

            sb.append("#").append(t).append(" ").append(over >= (52 - N) ? "STOP" : "GAZUA").append("\n");
        }
        System.out.println(sb);
    }
}
