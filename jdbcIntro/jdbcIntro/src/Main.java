import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static String userName = "root"; //db kullanıcı adı
    static String password = "mypass"; //db şifre

    static String dbURL = "jdbc:mysql://localhost:3306/world"; //bağlanılacak mysql veri tabanı şeması

    public static void main(String[] args) throws SQLException {
        //JDBC

        //JAVA APP  -->  JDBC Paketi -- DB Driver --                                 DB (Oracle, MySQL, SQL Server)

        //JDBC tüm sql operasyonlarına erişebilmek için kullanılan kütüphane
        //Kullanıcacak db sistemine bağlantıyı sağlayan nesne driver kullanılır.

        //DB Driver için Project Explorer menüsünden  mySQL Connector J dosya yolu eklendi.
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL,userName,password); //driverlara connectorlere erişmemizi sağlayan class
            System.out.println("Bağlantı oluştu.");
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }finally {
            connection.close(); //iş bittiğinde bağlanıyı kapatmayı sağlar
        }

    }
}