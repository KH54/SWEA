package swea.D3.숫자조작;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {

            char[] N = br.readLine().toCharArray();

            int max = Integer.parseInt(String.valueOf(N));
            int min = max;

            for (int i = 0; i < N.length; i++) {
                for (int j = i + 1; j < N.length; j++) {
                    char[] tempArr = N.clone();

                    char temp = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = temp;

                    if (tempArr[0] != '0') {
                        int number = Integer.parseInt(String.valueOf(tempArr));

                        max = Math.max(max, number);
                        min = Math.min(min, number);
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(min).append(" ").append(max).append("\n");
        }
        
        System.out.println(sb);
    }
}
