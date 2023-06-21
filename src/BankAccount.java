public class BankAccount {
    private static String bankNome;
    private int accountNumber;
    private double balance;

    public static void setBankName(String name) {
        bankNome = bankNome;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setBankNome(String exampleBank) {
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void getAccountInfo() {
        System.out.println("Bank Nome: " + bankNome);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}