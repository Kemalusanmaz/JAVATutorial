public class BalanceInsufficientException extends Exception{
    //custom exception oluşturulurken Exception classından inherit edilir.

    String message;
    public BalanceInsufficientException(String message){ //constructor blok ile message değişkeni operasyonun argümanına atanır.
        this.message = message; //tanımlanan String message = operasyondan gelecek String message
    }

    @Override
    public String getMessage(){ //Exception classından inheri edildiği için getMessage override edilir ve  düzenlenir.
        return this.message; // String message ifadesini return eder.
    }
}
