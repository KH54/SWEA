package swea.D2.파스칼의삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int N;
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            sb.append("#").append(i + 1).append("\n");

            Pascal(N);
        }
        System.out.println(sb);
    }

    static int[] Pascal(int N) {
        int[] arr = new int[N];

        if (N == 1) {
            arr[0] = 1;
            sb.append(arr[0]).append("\n");
            return arr;
        } else if (N == 2) {
            arr[0] = 1;
            arr[1] = 1;
            Pascal(N - 1);
        } else {
            arr[0] = 1;
            arr[N - 1] = 1;

            int[] temp = new int[N - 1];
            temp = Pascal(N - 1);

            for (int i = 1; i < N - 1; i++) {
                arr[i] = temp[i - 1] + temp[i];
            }
        }
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        sb.append("\n");
        
        return arr;
    }

}
