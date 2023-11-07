public class Main {
    public static void main(String[] args) {
        //müşterininin veritabanına kaydedilme operasyonu. Veritabanına kaydedilerken farklı veritabnı tekniklereine uygulanacak.

        /*BaseDatabaseManager[] databaseManagers = new BaseDatabaseManager[]{new OracleDatabaseManager(), new SQLServerDatabaseManager()};
        for (BaseDatabaseManager databaseManager:databaseManagers){
            databaseManager.getData();
        }*/
        CustomerManager customerManager = new CustomerManager(); //CustomerManager sınıfı mainde customerManager değişkenine tanımlanır
        //CustomerManager sınıında oluşturulan değişken burada Oracle olarak kullanılmak istendiği için inherit OracleDatabaseManger sınıfına atanır.
        //customerManager.databaseManager = new OracleDatabaseManager();
        //customerManager.databaseManager = new SQLServerDatabaseManager();
        customerManager.databaseManager = new MySQLDatabaseManager(); //sadece konfigürasyon değiştirilerek kod değiştirilmeden yeni özellik eklendi.

        customerManager.getCustomers();
        //bu fonk içinde databasemanger.getData() fonk çağrılıyordu.
        // databaseManager artık OracleDatabaseManager olarak yukarıda tanımlandıyani bu fonksiyon artık OracleDatabaseManager.getData() fonksiyonu olarak çalışıyor.
    }
}