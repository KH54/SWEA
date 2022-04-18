package swea.D2.간단한소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        int N;

        int a;
        int b;
        int c;
        int d;
        int e;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());

            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;

            while (N % 2 == 0) {
                N /= 2;
                a++;
            }

            while (N % 3 == 0) {
                N /= 3;
                b++;
            }
            while (N % 5 == 0) {
                N /= 5;
                c++;
            }
            while (N % 7 == 0) {
                N /= 7;
                d++;
            }
            while (N % 11 == 0) {
                N /= 11;
                e++;
            }

            sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(e).append("\n");
        }
        System.out.println(sb);
    }

}
