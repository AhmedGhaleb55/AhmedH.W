package LAP6;
import java.util.Scanner;

public class Exer_4 {
    public static void main(String[] args) {
        String w ;int  re;


        Scanner in=new Scanner(System.in);
        System.out.println("what is your word: ");
        w=in.next();
        re=w.length();

        for
        (int i = 1; i < w.length() ; i--) {
            re--;
            System.out.print(w.charAt(re));
        }

    }
}
