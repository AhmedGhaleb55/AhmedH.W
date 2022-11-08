package lap3;

import java.util.Scanner;

public class Exercises_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter any Number :");
        long N = in.nextLong();
        if (N<0)
        {N=N * -1;}
        int BIT;
        if (N>999999999)
        {BIT =10;}
        else if (N>99999999)
        {BIT = 9;}
        else if (N > 9999999)
        {BIT = 8;}
        else if (N>999999)
        {BIT=7;}
        else if (N>99999)
        {BIT=6;}
        else if (N>9999)
        {BIT=5;}
        else if (N>999)
        {BIT=4;}
        else if (N>99)
        {BIT=3;}
        else if (N>9)
        {BIT=2;}
        else
        {BIT=1;}
        System.out.println(   "The number " + N+ "  has " +   BIT   + "   Bit   "      );






    }
}
