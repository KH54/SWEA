package swea.D3.반반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        HashMap<Character, Integer> map;

        String str;

        for (int t = 1; t <= T; t++) {
            map = new HashMap<>();

            str = br.readLine();

            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);

                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }

            for (Entry<Character, Integer> entrySet : map.entrySet()) {
                if (!str.equals("No")) {
                    str = entrySet.getValue() != 2 ? "No" : "Yes";
                }
            }

            sb.append("#").append(t).append(" ").append(str).append("\n");
        }
        System.out.println(sb);
    }

}
