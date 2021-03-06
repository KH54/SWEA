package swea.D3.순열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {

            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            HashMap<Integer, Integer> map = new HashMap<>();

            String result = "Yes";

            for (int n = 0; n < N; n++) {
                int num = Integer.parseInt(st.nextToken());
                if (map.containsKey(num)) {
                    result = "No";
                }
                map.put(num, 1);

            }

            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

}
