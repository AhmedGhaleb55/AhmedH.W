package lap3;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("enter the number :");int x= in.nextInt();


        System.out.println("enter the letter :"); String y= in.next();

        if(y.equals("A") || y.equals("B") || y.equals("C") || y.equals("G"))
        {
            if (x%2==0) System.out.println("Color is Black");


            else System.out.println("Color is Bhite");
        }
        else
        {
            if (x % 2 != 0)
                System.out.println("Color is Black");
            else
                System.out.println("Color is White");
        }
    }
}
