import java.util.ArrayList;
import java.util.Scanner;

public class BOJ11718 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(in.hasNextLine()){
            String word = in.nextLine();
            if(word.length()>100 || word.startsWith(" ") || word.endsWith(" ") || word.isEmpty()) {
                break;
            }
            words.add(word);

        }
        in.close();

        for(int i=0; i< words.size() ; ++i) {
            System.out.println(words.get(i));
        }
    }
}