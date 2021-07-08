package baekjoon.basic;

import java.io.*;
import java.util.LinkedList;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> deque = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N ; i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push_back":
                    deque.addLast(Integer.parseInt(input[1]));
                    break;
                case "push_front":
                    deque.addFirst(Integer.parseInt(input[1]));
                    break;
                case "pop_front":
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.pop()).append('\n');
                    }
                    break;
                case "pop_back":
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.removeLast()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if(deque.isEmpty()) {
                        sb.append(1).append('\n');
                    }else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.peek()).append('\n');
                    }
                    break;
                case "back":
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.peekLast()).append('\n');
                    }
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
