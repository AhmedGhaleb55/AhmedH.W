package lap3;

import java.util.Scanner;

public class Exercises_10 {
    public static void main(String[] args) {

        Scanner INPUT = new Scanner(System.in);
        String M;
        System.out.println("Enter The Month :");M=INPUT.next();



        if (M.equals("january"))
            System.out.println("The Number Of Dates is :" + 31);


        else if (M.equals("february"))
            System.out.println("the number of dates is :" + 30);


        else if  (M.equals("march"))
            System.out.println("the number of dates is :" + 31);

        else if (M.equals("aril"))
            System.out.println("the number of dates is :" + 30);

        else if (M.equals("may"))
            System.out.println("the number of dates is :" + 31);


        else if (M.equals("june"))
            System.out.println("the number of dates is :" + 30);


       else if (M.equals("july"))
            System.out.println("the number of dates is :" + 31);


        else if (M.equals("august"))
            System.out.println("the number of dates is :" + 30);


        else if (M.equals("september"))
            System.out.println("the number of dates is :" + 31);


        else if (M.equals("october"))
            System.out.println("the number of dates is :" + 30);


         else if (M.equals("november"))
            System.out.println("the number of dates is :" + 31);


        else if (M.equals("december"))
            System.out.println("the number of dates is :" + 30);


    }
}
