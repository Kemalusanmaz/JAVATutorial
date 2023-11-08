public class Main {
    public static void main(String[] args) {
        //interfaces => tamamlanmamış operasyonlar içerir abstract class gibi.
        // Interfaceler implementasyon kabu edilir. Bir class birden fazla classı inherit edebilir.
        //Interfaceler abstract gibi new lenemez. İçi dolu değil
        //Interface, operasyon implemente edilmesigerek duurmlarda kullanılır.
        //Yazılım projelerinde katmanlar vardır. UI katmanı örn html, İş Katmanı örn manager. Data access katmanı.
        // Bu katmanların geçişleri interface ile yapılır Bağımlılıktan kaçınmak için.

        //Implementasyon => bir class birrden fazla classı implement edebilir.

        //polimorphgism interfaceile uygulama yöntemleri

        //ICustomerDal iCustomerDal = new OracleCustomerDal(); //Interface, onu implemente eden classın referansını tutabilir. Polimorphisim.
        //-----1. Yöntem ------
        /*CustomerManager customerManager = new CustomerManager();
       // customerManager.customerDal = new OracleCustomerDal(); // customerDal artık Oracle seçilir.
        customerManager.customerDal = new NoSQLCustomerDal();
        customerManager.add(); // fonksiyon şimdi kullanılabilir.*/

        //------ 2. Yöntem ------
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}