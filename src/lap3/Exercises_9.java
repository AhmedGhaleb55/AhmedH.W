package lap3;

import java.util.Scanner;

public class Exercises_9 {
    public static void main(String[] args) {
        int AS   ,  ZX;

        String month = null;

        Scanner INPUT= new Scanner(System.in);
        System.out.println("enter the month :");AS = INPUT.nextInt();

        System.out.println("enter  the days :");ZX = INPUT.nextInt();

        if (AS==1 || AS==2 || AS==3)

            month ="winter";

        else if (AS==4 || AS==5 || AS==6)

            month ="spring";

        else if (AS==7 || AS==8 || AS==9)

            month ="summer";

        else if (AS==10 || AS==11 || AS==12)

            month ="fall";


        if (AS%3 == 0 && ZX>=21)
            if (month.equals("winter"))
                month="spring";
            else if (month.equals("spring"))
                month="summer";
            else if (month.equals("summer"))
                month="fall";
            else
                month="fall";

        System.out.println(month);



    }
}
