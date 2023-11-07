public class Main {
    public static void main(String[] args) {
        //polimorphism => çok biçimlilik.
        // Referans tiplerin aralarında bir inheritance varsa birbirinin referansını tutması olayıdır.
        //Aralarında inheritance yoksa polimorphisim amacıyla kullanılamaz.
        //Classların üstlerinin aynı olması gerekiyor.


        //Inheritance özelliğinden dolayı baselogger içinde tanımlanan fonksiyon artık
        // tek tek email,database vb.. gibi classlar üzerinden çağrılabilir.
        //Fakat bir değişiklik olduğunda bunun değiştirilmesi zor olur.

        /*EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Log mesajı");*/

        //BaseLogger türünde bir dizi tanımlanır.
        //Email,database,console,file classları base'den miras aldığı için BaseLogger türünde çağrılabilir.
        //Bir for döngüsüyle dizini tüm elemanlarına ulaşılarak log fonksiyonu bu şekilde çağrılabilir.
        /*BaseLogger[] Loggers = new BaseLogger[]{new EmailLogger(), new DatabaseLogger(), new FileLogger(), new ConsoleLogger()};
        for (BaseLogger logger: Loggers){
            logger.log("Log mesajı");
        }*/

        //CustomerLogger classında yapıcı metot ile baseLogger tipinde bir logger değişkeni tanımlanır.
        //bu logger değişkeni istenilen logger olabilir file,database,console vb...
        CustomerManager customerManager = new CustomerManager(new FileLogger() );
        //add fonksiyonu çağrılarak hem ekleme hem de loglama işlemi yapılır.
        customerManager.add();



    }
}