package LAP6;

public class Exer_6 {
    public static void main(String[] args) {
        int po=2;

        System.out.println(" (All powers of 2 from 2^0 up to 2^20) ");
        for (int i = 0; i <= 20; i++) {
            if (i==0)
                po=1;
            else if (i==1)
                po=2;
            else po=po*2;

            System.out.print(po+" ");

        }
    }
}
