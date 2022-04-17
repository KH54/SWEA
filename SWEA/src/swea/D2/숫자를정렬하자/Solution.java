package swea.D2.숫자를정렬하자;

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
        int N;
        int[] arr;
        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");

            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine());

            for (int n = 0; n < N; n++) {
                arr[n] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }

}
