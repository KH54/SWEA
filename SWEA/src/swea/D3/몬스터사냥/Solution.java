package swea.D3.몬스터사냥;

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

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            
            double D = Integer.parseInt(st.nextToken());
            double L = Integer.parseInt(st.nextToken()) * 0.01;
            double N = Integer.parseInt(st.nextToken());
            double result = D;
            
            
            for(int i = 1 ; i < N; i++) {
                result += D*(1+i*L);
            }

            sb.append("#").append(t).append(" ").append((int)result).append("\n");
        }
        System.out.println(sb);
    }
}
