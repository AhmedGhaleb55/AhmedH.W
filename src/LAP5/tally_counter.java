package LAP5;

public class tally_counter {
   private  int val;
     public tally_counter()
     {this.val = 0;}
     public void  click()
     { val++;}

    public  void button()
    {val =val -1;}

    public void rest()
    {val = 0;}




    public  int getValue(){return val;}



}
