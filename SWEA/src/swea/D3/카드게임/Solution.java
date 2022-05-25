package swea.D3.카드게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

            for (int i = 20 - sum; i < 10; i++) {
                over += arr[i];
            }

            sb.append("#").append(t).append(" ").append((52 - N - over) <= over ? "STOP" : "GAZUA").append("\n");
        }
        System.out.println(sb);
    }
}
