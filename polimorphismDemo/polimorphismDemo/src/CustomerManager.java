public class CustomerManager {

    //CustomerManager classında müşteri ekleme, çıkartma gibi fonksiyonlar yazılır.

    //BaseLogger türünde bir private değişken tanımlanır.
    private BaseLogger logger;

    //bu classın yapıcı fonksiyonudur. dışarıdan baselagger türünde logger argümanı çağrılır.
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    //bu class üzerinde çağrılacak add fonksiyonun içinde müşteri eklendi bilgisi gelir.
    //baselogger rüünde logger değişkenimiz olduğu için log fonksiyonu çağrılabilir.
    public void add(){
        System.out.println("Müşteri eklendi.");
        this.logger.log("log mesajı");

        /*DatabaseLogger logger = new DatabaseLogger();
        logger.log("Log mesajı");*/


    }
}
