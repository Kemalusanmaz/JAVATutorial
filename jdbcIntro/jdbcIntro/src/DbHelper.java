import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String userName = "root"; //db kullanıcı adı
    private String password = "mypass"; //db şifre
    private String dbURL = "jdbc:mysql://127.0.0.1:3306/world"; //bağlanılacak mysql veri tabanı şeması

    public Connection getConnection() throws SQLException {
        System.out.println("DB bağlanıldı.");
        return DriverManager.getConnection(dbURL,userName,password); //driverlara connectorlere erişmemizi sağlayan class

    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code: " + exception.getErrorCode());
    }
}
