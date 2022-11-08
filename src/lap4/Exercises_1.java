package lap4;
import java.awt.*;

public class Exercises_1 {
    public static void main(String[] args) {
        Rectangle as=new Rectangle(10,20);

        double m=2* (as.getWidth()+as.getHeight());

        System.out.println("Actual Answer  : "+m);

        System.out.println("Expected Answer  : "+2*(20+10));

    }
}
