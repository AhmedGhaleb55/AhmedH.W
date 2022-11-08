package LAP5;

public class teseter_bank_accounter3 {
    public static void main(String[] args) {

        Bank_accounter_3 as = new Bank_accounter_3(0);
        as.deposit( 1000);

        System.out.println(as.getBalance());
        as.withraw(500);
        as.withraw(400);


        System.out.print(as.getBalance() );
        System.out.print("$");

    }



}
