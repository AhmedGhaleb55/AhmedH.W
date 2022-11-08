package LAP5;

public  abstract   class bank_account {
    private  double bal;
    private double numberDeposit;
    private double numberWithdrawals;

    private double interest_rate;  protected  double srrvicce_charges;


    public double getBalance()
    {
        return bal;
    }
    public void setBalance(double balance)
    {
        this.bal = balance;
    }
    public double getNumber_deposit()
    {
        return numberDeposit;
    }

    public double getNumber_withdrawals() {

        return numberWithdrawals;

    }
    public double getInterest_rate(){
        return  interest_rate;
    }

    public bank_account(double balance , double apr){
        this.bal = balance;
        this.interest_rate=apr;
    }
    private  void depoist(double amount){
        this.bal += amount;
        this.numberDeposit++;
    }
    void withdraw(double amount){
        this.bal -= amount;
        this.numberWithdrawals++;
    }

    public  void  calcInterest(){
        double monthlyInterest = (interest_rate /12 );
     monthlyInterest = bal * monthlyInterest;
     this.bal += monthlyInterest;
    }
    public  void monthlyprocess(){
        this.bal -= srrvicce_charges;
        calcInterest();

        this.numberDeposit = 0;
        this .numberWithdrawals = 0;
        this.srrvicce_charges = 0;
    }


    protected void deposit(double amount) {
    }
}
