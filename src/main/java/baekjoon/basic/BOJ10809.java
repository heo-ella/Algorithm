package baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        for(char ch= 'a'; ch<='z'; ch++){
            sb.append(input.indexOf(ch));
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
