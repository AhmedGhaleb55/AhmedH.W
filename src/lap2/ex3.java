package lap2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double t  ,   r;
        System.out.println("enter t:");  t= in.nextDouble();
        System.out.println("enter r"); r= in.nextDouble();

        System.out.println("the area is :" + (t*r));
        System.out.println("the parameter is :" + (2*(t+r)));
    }
}
