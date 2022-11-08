package lap3;

import java.util.Scanner;

public class Exercises_5 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter the number 1 :");int X= in.nextInt();
        System.out.println("enter the number 2  :");int Z = in.nextInt();
        System.out.println("enter the number 3  :");int z = in.nextInt();


        if (X==Z && Z==z)
            System.out.println("all the same");
        else
            System.out.println("all different");


    }
}
