package swea.D2.수도요금경쟁;

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

        // A사 1L당 요금
        int P;
        // B사 R리터 이하 요금
        int Q;
        // B사 기준
        int R;
        // R + B사 1L당 요금
        int S;
        // 월간 사용량
        int W;

        // A사 요금
        int A;

        // B사 요금
        int B;

        // 저렴한 회사
        int cheap;

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");

            st = new StringTokenizer(br.readLine());

            P = Integer.parseInt(st.nextToken());
            Q = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            A = W * P;

            B = R >= W ? Q : Q + ((W-R) * S);

            cheap = A >= B ? B : A;
            
            sb.append(cheap).append("\n");
        }
        System.out.println(sb);
    }

}
