package LAP6;
import java.util.Scanner;
public class Exer_2 {
    public static void main(String[] args) {
        int AS, ZX , sumation=0;
        Scanner input=new Scanner(System.in);
        {
            for (int i = 2; i <= 100; i++) {
                if (i % 2 == 0) {sumation = sumation + i;}
            }
            System.out.println("The sum of all even numbers between 2 and 100: " + sumation);
        }
        {
            System.out.print("Enter a  and  b numbers: ");AS = input.nextInt(); ZX = input.nextInt();
            sumation = 0;
            for (int i = AS; i <= ZX; i++) {
                if (i % 2 == 1) {sumation = sumation + i;}
            }
            System.out.println("The sum of all odd numbers between a and b : " + sumation);
        }
        {
            sumation = 0;String d;
            System.out.println("input number: ");
            d = input.next();
            int A = d.length();
            for (int i = 0; i < A; i++) {
                if (d.charAt(i) % 2 == 1) {
                    System.out.println("the odd numbers in your input are: "+d.charAt(i));
                    sumation = sumation + d.charAt(i);   //note  what is the problem  in this line.  Dr.Fatima. the summation is wrong.

                }
            }

            System.out.println("The sum of all odd of an input: " + sumation);
        }

    }
}
