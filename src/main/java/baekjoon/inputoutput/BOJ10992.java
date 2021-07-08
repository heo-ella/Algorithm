package baekjoon.inputoutput;

import java.util.Scanner;

public class BOJ10992 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        for(int i=1; i<=N; i++){
            for(int j=0; j < N-i ; j++)
                System.out.print(" ");

            if(i==1 || i==N){
                for(int j=0; j<(2*i-1); j++)
                    System.out.print("*");
            }else{
                System.out.print("*");
                for(int j=0; j < 2*(i-1)-1 ; j++)
                    System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }
    }
}