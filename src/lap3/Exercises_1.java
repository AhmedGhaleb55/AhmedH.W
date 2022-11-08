package lap3;

public class Exercises_1 {
    public static void main(String[] args) {

        int r = 1 ,c= -1;

        if (r < -c)
        {
            System.out.print(r);
        }
        else {
            System.out.print(c);
        }
        r = 1;
        c = -1;
        if (-r >= c)
        { System.out.print(r); }
        else { System.out.print(c); }
        double x = 0  , y = 1;

        if (Math.abs(x - y) < 1)
        { System.out.print(x); }


        else { System.out.print(y); }
        x = Math.sqrt(2);
        y = 2;


        if (x * x == y)
        { System.out.print(x); }
        else { System.out.print(y); }

    }
}
