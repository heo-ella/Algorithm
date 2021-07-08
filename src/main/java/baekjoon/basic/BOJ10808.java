package baekjoon.basic;

import java.io.*;

public class BOJ10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] alphaArr = new int[26];
        int index;

        for(int i=0; i<input.length(); i++){
            index = (int)input.charAt(i)-97; //a의 아스키 코드값을 뺌
            alphaArr[index]++; // 해당 alphabet을 counting
        }
        for(int num : alphaArr){
            System.out.print(num+" ");
        }

    }
}
