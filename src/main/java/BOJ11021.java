import java.util.Scanner;

public class BOJ11021 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int caseNum = 1;
        int arr[] = new int[t];

        for(int i=0; i<t ; i++){
            arr[i] = in.nextInt() + in.nextInt();
        }
        for(int out :arr ){
            System.out.println("Case #"+ caseNum++ +": "+out);
        }
    }
}