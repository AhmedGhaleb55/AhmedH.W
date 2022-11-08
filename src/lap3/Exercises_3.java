package lap3;

import java.util.Scanner;

public class Exercises_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    int we;
        System.out.println("enter we :");we=input.nextInt();
        if (we>0)

            System.out.println("positive");

        else if (we<0) {


            System.out.println("negative");
        }
        else

            System.out.println("The Number is 0");
    }
}
