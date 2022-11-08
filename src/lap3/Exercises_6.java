package lap3;

import java.util.Scanner;

public class Exercises_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P,C,Z;
        System.out.println("enter x :");P=in.nextInt();

        System.out.println("enter y :");C=in.nextInt();

        System.out.println("enter z :");Z =in.nextInt();

        if (P == C || P==Z)
            System.out.println("all the same");
        else if (P != C || P!= Z) {
            System.out.println("al not the same");
        }
    }
}
