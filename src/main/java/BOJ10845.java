import java.util.LinkedList;
import java.util.Scanner;

public class BOJ10845 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> que = new LinkedList<>();
        String cmd;

        for(int i=0; i<n; i++){

            cmd = scan.next();

            if(cmd.equals("push")){
                int num = scan.nextInt();
                que.add(num);
            }else if(cmd.equals("pop")){
                System.out.println(que.isEmpty()?-1:que.poll());
            }
            else if(cmd.equals("size")){
                System.out.println(que.size());
            }
            else if(cmd.equals("empty")){
                System.out.println(que.isEmpty()?1:0);
            }
            else if(cmd.equals("front")){
                System.out.println(que.isEmpty()?-1:que.getFirst());
            }
            else if(cmd.equals("back")){
                System.out.println(que.isEmpty()?-1:que.getLast());
            }
        }

    }
}
