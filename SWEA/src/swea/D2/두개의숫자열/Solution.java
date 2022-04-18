package swea.D2.두개의숫자열;

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
        int M;

        int[] arrA;
        int[] arrB;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arrA = new int[N];
            arrB = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int n = 0; n < N; n++) {
                arrA[n] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int m = 0; m < M; m++) {
                arrB[m] = Integer.parseInt(st.nextToken());
            }

            sb.append(sum(arrA, arrB)).append("\n");
        }
        
        System.out.println(sb);
    }

    static int sum(int[] arrA, int[] arrB) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        if (arrA.length > arrB.length) {
            int[] temp = arrA.clone();
            arrA = arrB;
            arrB = temp;
        }

        for (int i = 0; i < arrB.length - arrA.length + 1; i++) {
            sum = 0;
            for (int j = 0; j < arrA.length; j++) {
                sum += arrA[j] * arrB[i + j];
            }

            max = max < sum ? sum : max;
        }

        return max;
    }

}
