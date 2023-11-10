import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //dosya yolu verilir.
        File file = new File("D:\\KEMAL_PROJECTS\\JAVA_ile_Programlamaya_Giris\\javaDemos\\Files\\students.txt");
        try {
            //checked exception olduğu için try-catch içine alınmalıdır.
            //dosyayı oluşturur ve true false return olur.

            if (file.createNewFile()){ //dosya yoksa oluşturur ve true döner dosya varsa oluşturmaz ve false döner
                System.out.println("Dosya oluşturuldu");
            }else {
                System.out.println("Dosya zaten var.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}