import java.util.Arrays;
import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] inputs = new int[N];

        if(N >=1 && N <=1000000){
            for(int i=0; i<N ; i++){
                inputs[i] = in.nextInt();
                if(inputs[i] < -1000000 && inputs[i] > 1000000) break;
            }
            in.close();
            Arrays.sort(inputs);
            System.out.println(inputs[0] + " " + inputs[N-1]);
        }

    }
}