package baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;

        while((input = br.readLine()) !=null){
            int[] count = new int[4];

            for(int i=0; i<input.length(); i++){
                char value = input.charAt(i);

                // 소문자
                if(value >= 'a' && value <='z'){
                    count[0]++;
                }
                // 대문자
                if(value >= 'A' && value <='Z'){
                    count[1]++;
                }
                // 숫자
                if(value >= '0' && value <='9'){
                    count[2]++;
                }
                // 공백
                if(value == ' '){
                    count[3]++;
                }
            }
            for(int output: count){
                sb.append(output);
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
