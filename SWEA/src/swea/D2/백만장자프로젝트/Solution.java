package swea.D2.백만장자프로젝트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
    static int arr[];
    static StringBuilder sb = new StringBuilder();
 
    public static void main(String[] args) throws NumberFormatException, IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        StringTokenizer st;
 
        int T = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N];
 
            st = new StringTokenizer(br.readLine());
 
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
 
            trade(i);
        }
        System.out.println(sb);
    }
 
    public static void trade(int count) {
        int maxValue = arr[arr.length - 1];
        long result = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (maxValue > arr[i]) {
                result += maxValue - arr[i];
            } else {
                maxValue = arr[i];
            }
        }
 
        sb.append("#").append(count + 1).append(" ").append(result).append("\n");
    }
}
