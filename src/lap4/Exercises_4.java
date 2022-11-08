package lap4;
import java.awt.*;

public class Exercises_4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);


        System.out.println("Actual : "+box);
        System.out.println("Expected : "+new Rectangle(0,0,20,30));




    }
}
