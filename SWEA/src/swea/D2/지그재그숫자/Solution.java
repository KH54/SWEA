package swea.D2.지그재그숫자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int sum;

        for (int i = 0; i < T; i++) {
            
            sb.append("#").append(i+1).append(" ");
            
            int N = Integer.parseInt(br.readLine());
            sum = 0;
            
            for (int j = 1; j <= N; j++) {
                if (j % 2 == 0) {
                    sum -= j;
                } else {
                    sum += j;
                }
            }
            
            sb.append(sum).append("\n");
        }
        
        System.out.println(sb);
    }

}
