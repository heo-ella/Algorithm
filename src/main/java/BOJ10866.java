import java.util.LinkedList;
import java.util.Scanner;

public class BOJ10866 {
    public static void main(String[] args){
        LinkedList<Integer> deque = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i=0; i<N ; i++){
            String input = in.next();
            int value;
            switch (input){
                case "push_back":
                    value = in.nextInt();
                    deque.addLast(value);
                    break;
                case "push_front":
                    value = in.nextInt();
                    deque.addFirst(value);
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
