package swea.D3.팔씨름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        char[] arr;
        String str;
        int count;

        for (int t = 1; t <= T; t++) {

            str = br.readLine();

            arr = new char[str.length()];
            count = 0;

            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
                if (arr[i] == 'o') {
                    count++;
                }
            }

            count += 15 - arr.length;
            
            sb.append("#").append(t).append(" ").append(count > 7 ? "YES" : "NO").append("\n");
        }
        
        System.out.println(sb);
    }

}
