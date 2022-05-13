package swea.D3.문자열의거울상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String str = br.readLine();

            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {

                switch (str.charAt(i)) {
                case 'b':
                    result.append('d');
                    break;
                case 'd':
                    result.append('b');
                    break;
                case 'p':
                    result.append('q');
                    break;
                case 'q':
                    result.append('p');
                    break;
                }

            }
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

}
