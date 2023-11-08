public class Main {
    public static void main(String[] args) {
        //interfaces => tamamlanmamış operasyonlar içerir abstract class gibi.
        // Interfaceler implementasyon kabu edilir. Bir class birden fazla classı inherit edebilir.
        //Interfaceler abstract gibi new lenemez. İçi dolu değil
        //Interface, operasyon implemente edilmesigerek duurmlarda kullanılır.
        //Yazılım projelerinde katmanlar vardır. UI katmanı örn html, İş Katmanı örn manager. Data access katmanı.
        // Bu katmanların geçişleri interface ile yapılır Bağımlılıktan kaçınmak için.

        //Implementasyon => bir class birrden fazla classı implement edebilir.


        ICustomerDal iCustomerDal = new OracleCustomerDal(); //Interface, onu implemente eden classın referansını tutabilir. Polimorphisim.

    }
}