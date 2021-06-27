import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

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
                    System.out.println(deque.isEmpty()?-1:deque.pop());
                    break;
                case "pop_back":
                    System.out.println(deque.isEmpty()?-1:deque.removeLast());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    System.out.println(deque.isEmpty()?1:0);
                    break;
                case "front":
                    System.out.println(deque.isEmpty()?-1:deque.peek());
                    break;
                case "back":
                    System.out.println(deque.isEmpty()?-1:deque.peekLast());
                    break;
            }
        }
    }

}
