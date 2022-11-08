package lap4;

public class Exercises_2 {
    public static void main(String[] args) {

        String AS=new String("Mississippi");

        String  W=AS.replace("i","ii");
        System.out.println("After 1 modification: "+W);
        System.out.println("The the 1 resulting string: "+W.length());

        String RT=W.replace("ss","s");

        System.out.println("After 2 modification: "+RT);
        System.out.println("The two second resulting string: "+RT.length());


    }
}
