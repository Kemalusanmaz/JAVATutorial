public class AccountManager {

    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception {
        //1.yöntem
        if (balance >= amount){
            balance = getBalance() - amount;

        }else {
            throw new Exception("Bakiye yetersiz.");
        }



    }


    public double getBalance() { //hesaptaki paranın okunması için balance enkapsüle edili.r
        return balance;
    }
}
