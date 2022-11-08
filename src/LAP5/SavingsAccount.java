package LAP5;

public class SavingsAccount extends bank_account {
    static  boolean Isa_active;
    public SavingsAccount(double balance , double apr)
    {super(balance,apr);
        Isa_active = super.getBalance()>= 25;
    }
  public  void withdraw(double amount)
  {
      if (super.getBalance() < 25){
          System.out.println("Your account  balance is too low , and your account  is  inactive :");
          Isa_active= false;
      }
      else {
          super.withdraw(amount);
      }
  }
         public  void  deposit (double amount){
             super.deposit (amount);
     if (super.getBalance() > 25){
         System.out.println("Your account is active :");
         Isa_active = true;
     }
}
public  void  monthlyProcess(){
        if (super.getNumber_withdrawals()>4){
           super. srrvicce_charges += 1;
        } if (super.getBalance()<25){
        System.out.println("The account is inactive, your  balance is less than $ 25.");
        Isa_active = false;

    }






}


}

