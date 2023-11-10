
public class Main {
    public static void main(String[] args) {

        AccountManager manager = new AccountManager();

        manager.deposit(100);

        System.out.println("Hesap: " + manager.getBalance());

        try {
            manager.withdraw(90);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hesap: " + manager.getBalance());

        try {
            manager.withdraw(20);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hesap: " + manager.getBalance());

    }
}