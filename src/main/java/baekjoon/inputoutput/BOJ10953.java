package baekjoon.inputoutput;

import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int i=0; i<t ; i++){
            String[] arr = in.next().split(",");
            System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
        }
    }
}
