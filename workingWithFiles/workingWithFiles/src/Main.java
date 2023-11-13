import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner; //dosyanın okunması için gereken paket

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();

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

    public static void readFile(){
        File file = new File("D:\\KEMAL_PROJECTS\\JAVA_ile_Programlamaya_Giris\\javaDemos\\Files\\students.txt");
        try {
            Scanner reader = new Scanner(file); // Scanner classının referansı alınır. ve io operasyonu try catch içine alınmak zorundadır.
            while (reader.hasNextLine()){ //her satır okunur bir sonraki satır okunabilirse true döner.
                String line = reader.nextLine(); //her satır sırayla okunur.
                System.out.println(line);
            }
            reader.close(); //doyas işi biitince kapatılması gerekir bellekten uçurulması gerekir.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    }



