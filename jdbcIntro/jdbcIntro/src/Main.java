import javax.naming.Name;
import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        //JDBC

        //JAVA APP  -->  JDBC Paketi -- DB Driver --                                 DB (Oracle, MySQL, SQL Server)

        //JDBC tüm sql operasyonlarına erişebilmek için kullanılan kütüphane
        //Kullanıcacak db sistemine bağlantıyı sağlayan nesne driver kullanılır.

        //DB Driver için Project Explorer menüsünden  mySQL Connector J dosya yolu eklendi.
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        Statement statement = null; //SQL cümleciği sorgusu için kullanılacak
        ResultSet resultSet; //sorgunun soınucunda gelen data sonucu

        try {

            connection = dbHelper.getConnection();
            statement = connection.createStatement();// bu bğalntı için statement oluştur. çünkü başka veri tabanlarına da bağlantı sağlanabilir.
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country"); //statementta oluşturulan bağlantı için argümandaki sorguyu çalıştır.
            ArrayList<Country> countries = new ArrayList<>(); //country tipinde arraylist oluşturulur
            while (resultSet.next()){ // tek tek gez
                //System.out.println(resultSet.getString("Name")); //name alanını string olarak getir ve ekrana yaz
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region") ));

            }

            System.out.println(countries.size());



        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            connection.close(); //iş bittiğinde bağlanıyı kapatmayı sağlar
        }

    }
}