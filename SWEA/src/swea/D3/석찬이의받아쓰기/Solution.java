package swea.D3.석찬이의받아쓰기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            
            char[] charArr = br.readLine().toCharArray();
            char[] charArr2 = br.readLine().toCharArray();
            
            int cnt = 0;
            for(int n = 0; n < N; n++) {
                if(charArr[n] == charArr2[n]) {
                    cnt++;
                }
            }
            sb.append("#").append(t).append(" ").append(cnt).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }

}
