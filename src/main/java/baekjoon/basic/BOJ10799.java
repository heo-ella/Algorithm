package baekjoon.basic;

import java.util.Scanner;
import java.util.Stack;

public class BOJ10799 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stick = scan.next();
        int ans = 0;

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<stick.length(); i++){
            if(stick.charAt(i)=='(') {
                stack.push('(');
            }else{
                // stick.chartAt(i)==')'
                stack.pop();
                if(stick.charAt(i-1)=='('){ // 레이저
                    ans += stack.size();
                }else{
                    ans +=1;
                }
            }
        }
        System.out.println(ans);
    }
}
