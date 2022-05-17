package swea.D3.제곱팰린드롬수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        boolean[] palindrome = new boolean[1001];

        for (int num = 1; num < 31; num++) {
            if (isPalindrome(String.valueOf(num).toCharArray()) && isPalindrome(String.valueOf(num * num).toCharArray())) {
                palindrome[num * num] = true;
            }
        }

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = 0;
            for(int i = A; i <= B; i++) {
                if(palindrome[i]) {
                    result++;
                }
            }
            
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static boolean isPalindrome(char[] arr) {
        int left = arr.length / 2 - 1;
        int right = arr.length % 2 == 0 ? arr.length / 2 : arr.length + 1;

        while (left >= 0 && right < arr.length) {
            if (arr[left] != arr[right]) {
                return false;
            }

            left--;
            right++;
        }

        return true;
    }

}
