package LAP6;
import java.util.Scanner;

public class Exer_5 {
    public static void main(String[] args) {
        int vo=0;
        String w;


        Scanner input=new Scanner(System.in);

        System.out.println(" write  word: ");w=input.nextLine();

        System.out.print("The vowels  are: ");
        for (int i = 0; i < w.length(); i++) {
            char Z=w.charAt(i);

            if ( Z== 'a' ||Z=='e'||Z=='i'||Z=='o'||Z=='u'||Z=='y') {
                vo++;
                System.out.print(w.charAt(i)+" ");
            }
        }
        System.out.println(" ");


        System.out.println("Your has: "+vo+" vowels ");
    }

}
