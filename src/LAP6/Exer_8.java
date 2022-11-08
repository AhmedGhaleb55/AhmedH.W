package LAP6;
import java.util.Scanner;
public class Exer_8 {
    public static void main(String[] args) {
        int P; ; int NUM ;
        Scanner in=new Scanner(System.in);


        System.out.println("THE number IS: ");NUM=in.nextInt();

        System.out.println("The prime numbers  is: ");
        for ( P = 2; P <= NUM; P++) {
            int j;
            for ( j = 2; j <=P; j++) {
                if (P%j==0)
                    break;
            }
            if (j>=P)
                System.out.println(P);
        }

    }
}
