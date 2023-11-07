public class CustomerManager {
    //--------Strategy Pattern----------
    BaseDatabaseManager databaseManager; //BaseDataManger tipinde bir databasemanager değişkeni oluşturulu.
    // Bu değişken istenilen baseden inherit almış database classını seçmek için kullanılır.
    public void getCustomers(){
        //getCustomers fonksiyonu ile örenğin oracla db kullanılacaksa OracleDatabaseManager.getData(): fonk çalışmış olur.
        databaseManager.getData();



    }
}
