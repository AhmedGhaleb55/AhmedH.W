package LAP5;


public class Bank_accounter_3 {
    private double bal;
    {
        bal=0 ;
    }
    public Bank_accounter_3(double intiBalance)

    { bal=intiBalance;
    }
    public void deposit(double amount)

    {bal=bal+=amount;
    }
    public void  withraw(double amount)
    {bal=bal-=amount;
    }
    public double getBalance()
    { return bal;}


}

