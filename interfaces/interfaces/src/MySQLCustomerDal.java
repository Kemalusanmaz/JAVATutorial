public class MySQLCustomerDal implements ICustomerDal, IRepository { //inheritancedan farklı olarak implements fonksiyonu ile base eklenir.
    //Birden fazla interface implement edilmiş olur. Ama inheritance'de sadece bir class extend edilebilir.
    //aynı zamandabase classıda extend edebilir.
    @Override
    public void add() {
        System.out.println("MySQL eklendi.");
    }
}
