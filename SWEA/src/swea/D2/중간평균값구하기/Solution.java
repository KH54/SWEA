package swea.D2.중간평균값구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        double[] arr = new double[10];
        double sum;
        double max;
        double min;
        for (int i = 0; i < T; i++) {

            sum = 0;
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;

            sb.append("#").append(i + 1).append(" ");

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            min = arr[0];
            max = arr[arr.length-1];

            for (int k = 0; k < arr.length; k++) {
                if (min != arr[k] && max != arr[k]) {
                    sum += arr[k];
                }
            }
            sb.append((int)Math.round(sum/8)).append("\n");
        }
        System.out.println(sb);
    }

}
