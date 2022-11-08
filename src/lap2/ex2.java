package lap2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bi=3.14;
        double as;
        System.out.println("enter the half of the qutr :");as= in.nextDouble();

        System.out.println("the area is :" + (bi*as*as));

        System.out.println("the parameter is :" + (bi*(2*as)));
    }
}
