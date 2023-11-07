public class ConsoleLogger extends BaseLogger{
//BaseLogger extend yapıldığı için içindeki log fonksiyonu bu class kullanılarak çağrılabilir.

    //Baseloggerda kullanılan log fonksiyonu inheritance özelliğiyle buraya da eklendiğinde override olmuş olur.
    //Main'de EmailLogger.log fonksiyonu çağrıldığında aşağıdaki fonksiyon çalışır.
    public void log(String message){

        System.out.println("Logged to database: " + message);
    }
}
