package access;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount accout = new BankAccount();
        accout.deposit(10000);
        accout.withdraw(3000);
        System.out.println("balance = " + accout.getBalance());
    }
}
