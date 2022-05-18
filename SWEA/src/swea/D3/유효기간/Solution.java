package swea.D3.유효기간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String num = br.readLine();
            
            int a = Integer.parseInt(num.substring(0,2));
            int b = Integer.parseInt(num.substring(2));
            
            String res = "";
            if(a < 13 && b < 13 && a != 0 && b != 0) {
                res = "AMBIGUOUS";
            } else if (a != 0 && a < 13) {
                res = "MMYY";
            } else if (b < 13 && b !=0) {
                res = "YYMM";
            } else {
                res = "NA";
            }
            
            sb.append("#").append(t).append(" ").append(res).append("\n");
        }
        System.out.println(sb);
    }

}
