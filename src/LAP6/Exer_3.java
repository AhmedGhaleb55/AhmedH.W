package LAP6;
import java.util.Scanner;

public class Exer_3 {
    public static void main(String[] args) {
        String w;   char ad=32;

        Scanner input=new Scanner(System.in);
        System.out.println("enter word: ");
        w=input.nextLine();


        for (int i = 0; i <w.length() ; i++)
        {
            if (w.charAt(i)>=97 ) {
                ad=ad++;
                char ca= (char) (w.charAt(i)-ad);
                System.out.println("  " + ca);
            }
            else
                System.out.println("  "+w.charAt(i));

        }
    }
}
