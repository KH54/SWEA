package swea.D2.새로운불면증치료법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // Test Case
        int T = Integer.parseInt(br.readLine());

        // Sheep Number
        int N;
        int count;
        int mul;
        // 0 ~ 9
        int[] arr;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");

            N = Integer.parseInt(br.readLine());
            mul = N;
            count = 2;
            
            arr = new int[10];

            while (true) {
                while (mul != 0) {
                    arr[mul % 10] = 1;
                    mul /= 10;
                }

                if (IntStream.of(arr).anyMatch(x -> x == 0)) {
                    mul = N * count++;
                } else {
                    break;
                }
            }
            
            sb.append(N*(count-1)).append("\n");
        }
        System.out.println(sb);
    }

}
