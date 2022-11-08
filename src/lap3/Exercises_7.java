package lap3;

import java.util.Scanner;

public class Exercises_7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int as,z,v;

        System.out.println("enter as :");
        as=in.nextInt();
        System.out.println("enter z :");
        z=in.nextInt();
        System.out.println("enter v :");
        v =in.nextInt();


        if (as > z && as > v && z>v)
            System.out.println(as + "      " + z + "      " + z);


        else if (z >as && z>v && as>v)
            System.out.println(z + "       " + as + "     " + v);

        else if (v > as && v >z && as>z)
            System.out.println(v + "       " + as + "       " + z);

    }
}
