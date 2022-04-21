package swea.D2.최빈수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int score;
        int number;

        HashMap<Integer, Integer> map;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            int N = Integer.parseInt(br.readLine());
            number = 0;

            map = new HashMap<>();
            st = new StringTokenizer(br.readLine());

            while (number != 1000) {
                score = Integer.parseInt(st.nextToken());

                if (!map.containsKey(score)) {
                    map.put(score, 1);
                } else {
                    map.put(score, map.get(score) + 1);
                }

                number++;
            }

            Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {

                @Override
                public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                    if(o1.getValue().compareTo(o2.getValue()) != 0) {
                        return o1.getValue().compareTo(o2.getValue());    
                    } else {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    
                }
            };

            Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);

            sb.append(maxEntry.getKey()).append("\n");
        }
        System.out.println(sb);
    }

}
