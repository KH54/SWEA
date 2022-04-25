package swea.D3.일요일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        int T = Integer.parseInt(br.readLine());
        String str;

        for (int t = 1; t <= T; t++) {

            str = br.readLine();

            for (int l = 0; l < arr.length; l++) {
                if (str.equals(arr[l])) {
                    sb.append("#").append(t).append(" ").append(arr.length - l).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }

}
