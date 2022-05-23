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

        Arrays.fill(arr, 4);

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int sum = 0;

            for (int n = 0; n < N; n++) {
                int num = Integer.parseInt(br.readLine());

                if (num == 1) {
                    arr[0] += -1;
                } else if (num == 10) {
                    arr[9] += -1;
                } else {
                    arr[num - 1] += -1;
                }

                sum += num;
            }

            int over = 0;
            int under = 0;

            for (int i = 1; i < arr.length + 1; i++) {
                if (sum + i >= 21) {
                    if (i == 10) {
                        over += arr[9];
                    } else if (i == 1) {
                        over += arr[0];
                    } else {
                        over += arr[i - 1];
                    }
                } else {
                    if (i == 10) {
                        under += arr[9];
                    } else if (i == 1) {
                        under += arr[0];
                    } else {
                        under += arr[i - 1];
                    }
                }
            }

            sb.append("#").append(t).append(" ").append(over >= under ? "STOP" : "GAZUA").append("\n");
        }
        System.out.println(sb);
    }
}
