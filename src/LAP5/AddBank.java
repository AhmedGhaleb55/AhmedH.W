package LAP5;

public class AddBank {
    private double blnce;

    {
        blnce=0 ;
    }
    public AddBank(double intiBalance)
    { blnce=intiBalance;
    }

    public void deposit(double amount)
    {blnce=blnce+=amount;}

    public void  withraw(double amount)
    {blnce=blnce-=amount; }

    public double getBalance() { return blnce;}
    public void addlnteresr(double Rate)
    {
        blnce += (blnce/Rate);
    }




}
