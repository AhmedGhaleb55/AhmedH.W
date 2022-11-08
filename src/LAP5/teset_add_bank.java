package LAP5;

public class teset_add_bank {
    public static void main(String[] args) {

        AddBank moSaving = new AddBank(1000);


        moSaving.deposit(5000);
        moSaving.withraw(1000);
        moSaving.addlnteresr(0.01);


        System.out.println( moSaving.getBalance());

        moSaving.withraw(5000);
        moSaving.withraw(1000);

        System.out.println(moSaving.getBalance() );
    }
}
