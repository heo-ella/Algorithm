package baekjoon.inputoutput;

import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            int A = in.nextInt();
            int B = in.nextInt();
            arr[i] = A+B;
        }

        in.close();

        for(int out : arr){
            System.out.println(out);
        }
    }
}
