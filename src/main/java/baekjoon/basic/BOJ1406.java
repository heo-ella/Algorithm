package baekjoon.basic;

import java.io.*;
import java.util.Stack;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        String[] arrStr = str.split("");

        for(String s: arrStr){
            left.push(s);
        }

        for(int i=0; i<n; i++) {
            String command = reader.readLine();
            char ch = command.charAt(0);

            switch(ch) {
                case 'L':
                    if(!left.isEmpty())
                        right.push(left.pop());
                    break;
                case 'D':
                    if(!right.isEmpty())
                        left.push(right.pop());
                    break;
                case 'B':
                    if(!left.isEmpty())
                        left.pop();
                    break;
                case 'P':
                    left.push(String.valueOf(command.charAt(2)));
                    break;
            }
        }

        while(!left.isEmpty()){
            right.push(left.pop());
        }

        while(!right.isEmpty()){
            System.out.print(right.pop());
        }

        bw.flush();
        bw.close();

    }
}
