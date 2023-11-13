import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //createFile();
        getFileInfo();

    }
    //dosya oluşturmak
    public static void createFile(){
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
    public static void getFileInfo(){
        File file = new File("D:\\KEMAL_PROJECTS\\JAVA_ile_Programlamaya_Giris\\javaDemos\\Files\\students.txt");

        if (file.exists()){ //dosya varsa true yoksa false döner
            System.out.println("Dosya adı: " + file.getName()); //getName dosya adını return eder.
            System.out.println("Dosya yolu: " + file.getAbsolutePath()); //getAbsolutePath dosya yolunu return eder.
            System.out.println("Dosya yazılabilir mi: " + file.canWrite()); //dosya sadece read-only ise false write and read ise true döner
            System.out.println("Dosya okunabilir mi: " + file.canRead()); //dosya sadece okunabilirse true döner
            System.out.println("Dosya boyutu (byte): " + file.length()); //dosyanın boyunu veriri
        }

    }

    }



