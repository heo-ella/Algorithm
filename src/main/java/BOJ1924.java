import java.util.Scanner;

public class BOJ1924 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        in.close();

        int sum = 0;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if((month>=1 && month<=12) && (day>=1 && day<=31)){
            for(int i=0 ; i<month ; i++){
                if(i==month-1) break;
                sum += months[i];
            }
            sum += day;

            int left = sum%7;
            switch (left){
                case 0: System.out.println("SUN"); break;
                case 1: System.out.println("MON"); break;
                case 2: System.out.println("TUE"); break;
                case 3: System.out.println("WED"); break;
                case 4: System.out.println("THU"); break;
                case 5: System.out.println("FRI"); break;
                case 6: System.out.println("SAT"); break;
            }
        }
    }
}