import javax.naming.Name;
import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        //JDBC

        //JAVA APP  -->  JDBC Paketi -- DB Driver --                                 DB (Oracle, MySQL, SQL Server)

        //JDBC tüm sql operasyonlarına erişebilmek için kullanılan kütüphane
        //Kullanıcacak db sistemine bağlantıyı sağlayan nesne driver kullanılır.

        //selectDemo();
        //insertDemo();
        //updateDemo();
        deleteDemo();
    }

    public static void selectDemo() throws SQLException{
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

    public static void insertDemo() throws SQLException {
        //DB Driver için Project Explorer menüsünden  mySQL Connector J dosya yolu eklendi.
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null; //insert sorgularında ekleme yaparaken prepared statement nesnesi kullanılır

        try {

            connection = dbHelper.getConnection();

            String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";

            //insert işlemi ile ekleme yaparken
            statement = connection.prepareStatement(sql); //? kullaınıcı tarafından parametre beleniyor.
            statement.setString(1,"Istanbul");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,20000);

            int result = statement.executeUpdate(); //etkilenen kayıt sayısı döner
            String state;
            if (result == 1){
                state = "Başarılı";
            }else {
                state = "Başarısız";
            }

            System.out.println("Kayıt güncelleme durumu: " + state);


        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close(); //iş bittiğinde bağlanıyı kapatmayı sağlar
            System.out.println("Bağlantı sonlandırıldı.");
        }
    }

    public static void updateDemo() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null; //insert sorgularında ekleme yaparaken prepared statement nesnesi kullanılır

        try {

            connection = dbHelper.getConnection();

            //String sql = "update city set population=80000, district = 'İstanbul'where id = 4091";
            String sql = "update city set population=?, district = ? where id = ?";
            //insert işlemi ile ekleme yaparken
            statement = connection.prepareStatement(sql); //? kullaınıcı tarafından parametre beleniyor.

            statement.setInt(1,25000); //1. soru işaretinini değerini 2. değer olarak ayarla
            statement.setString(2,"Turkey");
            statement.setInt(3,4089);
            int result = statement.executeUpdate(); //etkilenen kayıt sayısı döner
            String state;
            if (result == 1){
                state = "Başarılı";
            }else {
                state = "Başarısız";
            }

            System.out.println("Kayıt güncellenme durumu: " + state);


        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close(); //iş bittiğinde bağlanıyı kapatmayı sağlar
            System.out.println("Bağlantı sonlandırıldı.");
        }
    }

    public static void deleteDemo() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null; //insert sorgularında ekleme yaparaken prepared statement nesnesi kullanılır

        try {

            connection = dbHelper.getConnection();

            //String sql = "update city set population=80000, district = 'İstanbul'where id = 4091";
            String sql = "delete from city where id = ?";
            //insert işlemi ile ekleme yaparken
            statement = connection.prepareStatement(sql); //? kullaınıcı tarafından parametre beleniyor.

            statement.setInt(1,4082); //1. soru işaretinini değerini 2. değer olarak ayarla

            int result = statement.executeUpdate(); //etkilenen kayıt sayısı döner
            String state;
            if (result == 1){
                state = "Başarılı";
            }else {
                state = "Başarısız";
            }

            System.out.println("Kayıt silinme durumu: " + state);


        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close(); //iş bittiğinde bağlanıyı kapatmayı sağlar
            System.out.println("Bağlantı sonlandırıldı.");
        }
    }
}
