package swea.D3.외로운문자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        HashMap<Character, Integer> map;

        String str;
        for (int t = 1; t <= T; t++) {
            str = br.readLine();

            map = new HashMap<>();

            for (int l = 0; l < str.length(); l++) {
                char alpa = str.charAt(l);
                
                if(!map.containsKey(alpa)) {
                    map.put(alpa, 1);
                } else {
                    map.put(alpa, map.get(alpa) + 1);
                }
            }

            String result = "";

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    result += entry.getKey();
                }
            }
            if(result.equals("")) {
                result = "Good";
            }
            
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

}
