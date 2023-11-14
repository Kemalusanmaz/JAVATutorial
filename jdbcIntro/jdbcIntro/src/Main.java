import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {



    public static void main(String[] args) throws SQLException {
        //JDBC

        //JAVA APP  -->  JDBC Paketi -- DB Driver --                                 DB (Oracle, MySQL, SQL Server)

        //JDBC tüm sql operasyonlarına erişebilmek için kullanılan kütüphane
        //Kullanıcacak db sistemine bağlantıyı sağlayan nesne driver kullanılır.

        //DB Driver için Project Explorer menüsünden  mySQL Connector J dosya yolu eklendi.
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        try {

            connection = dbHelper.getConnection();
            System.out.println("Bağlantı oluştu.");
        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            connection.close(); //iş bittiğinde bağlanıyı kapatmayı sağlar
        }

    }
}