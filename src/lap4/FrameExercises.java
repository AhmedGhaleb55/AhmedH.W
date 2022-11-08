package lap4;

import javax.swing.*;
import java.awt.*;

public class FrameExercises {


    public static void main(String[] args) {

        JFrame F= new JFrame();
        F.setSize(400, 400);

        JLabel L = new JLabel("Hello, shehab alsultan!");
        L.setOpaque(true);
        L.setBackground(Color.pink);


        F.add(L);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setVisible(true);

        F.setVisible(true);


    }
}
