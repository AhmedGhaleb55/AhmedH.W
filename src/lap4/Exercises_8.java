package lap4;
import javax.swing.*;

public class Exercises_8 {
    public static void main(String[] args) {
        JFrame FJ=new JFrame("My_Name" );

        FJ.setSize(500,500);
        Exer_DRAW d=new Exer_DRAW();
        FJ.add(d);
        FJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FJ.setVisible(true);

    }
}
