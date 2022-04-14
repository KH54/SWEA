package swea.D2.초심자의회문검사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        String str;
        String a;
        char temp;
        for (int i = 0; i < T; i++) {
            a = "";
            sb.append("#").append(i + 1).append(" ");

            str = br.readLine();

            for (int j = str.length() - 1; j >= 0; j--) {
                temp = str.charAt(j);
                a += temp;
            }

            if (str.equals(a)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }

        }

        System.out.println(sb);
    }

}
