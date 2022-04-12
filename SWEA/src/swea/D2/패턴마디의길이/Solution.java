package swea.D2.패턴마디의길이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
         
        int T = Integer.parseInt(br.readLine());
        String index;
        for (int i = 0; i < T; i++) {
            index = br.readLine();
             
            for(int j = 1 ; j < 10; j++) {
                if(index.substring(0, j).equals(index.substring(j,j*2))) {
                    sb.append("#").append(i+1).append(" ").append(j);
                    break;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
 
}
