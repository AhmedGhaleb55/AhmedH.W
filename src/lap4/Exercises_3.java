package lap4;

public class Exercises_3 {
    public static void main(String[] args) {
        String AS=new String("Mississippi");


        String  ZX=AS.replace("i","!");

        System.out.println("actual : M!ss!ss!pp!");
        System.out.println("Expected : "+ZX);
        System.out.println("The length of  1resulting string: "+ZX.length());

        String CV=ZX.replace("s","$");

        System.out.println("actual : M!$$!$$!pp!");
        System.out.println("Expected : "+CV);
        System.out.println("The 2 length of the 2 resulting string: "+CV.length());

    }
}
