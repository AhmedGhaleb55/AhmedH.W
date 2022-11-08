package LAP6;
import java.util.Scanner;

public class Exer_7 {
    public static void main(String[] args) {
        int  N ,  D=0  , ADD=0 ;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number  : ");
        N=in.nextInt();

        System.out.println("Number "+N+" in binary is: ");

        for (int i = 0; i <8 ; i++) {
            ADD++;
            D=N%2;
            N=N/2;

            System.out.println(" "+D);
        }
        System.out.println("the number is divided "+ADD+" times");
    }
}
