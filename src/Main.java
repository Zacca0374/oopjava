public class Main {
    public static void main(String[] args) {
        BankAccount.setBankNome("Example Bank");

        BankAccount account1 = new BankAccount(12345678, 1000.0);
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.getAccountInfo();
        System.out.println();

        BankAccount account2 = new BankAccount(87654321, 2000.0);
        account2.deposit(1000.0);
        account2.withdraw(500.0);
        account2.getAccountInfo();
    }
}
