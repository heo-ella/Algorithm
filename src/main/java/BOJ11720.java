import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int N  = in.nextInt();
        String input = in.next();
        int sum=0;

        in.close();

        for(int i=0; i< N ; ++i) {
            sum += input.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}