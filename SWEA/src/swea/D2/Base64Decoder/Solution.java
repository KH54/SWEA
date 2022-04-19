package swea.D2.Base64Decoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        String text;
        byte[] textBytes;

        Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes;
        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            text = br.readLine();
            textBytes = text.getBytes();

            decodedBytes = decoder.decode(textBytes);

            sb.append(new String(decodedBytes)).append("\n");
        }
        System.out.println(sb);
    }

}
