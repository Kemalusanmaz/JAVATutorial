import java.io.BufferedReader; //bellekten dosya okunması için BufferReader paketi kullanılır.
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException { //FileReader oluşturulduğunda dosya yolunu bulamam ihtimaline karşı zorunlu olarak try-catchbloğuna alınır.
        //Bunun içinse new FileReader kısmı altı kırmızı çizgiyle uyarı verdiğinde mouse ile üstüne gidildiğinde satırın en solund akırmızı ampule tıklanır.
        // iki seçenek çıkar
        //Add exception to method signature
        //surround with try/catch ikisi de kullanılabilir.

        BufferedReader reader = null; //Bir reader tanımlanır.

        try {
            reader = new BufferedReader(new FileReader("D:\\KEMAL_PROJECTS\\JAVA_ile_Programlamaya_Giris\\javaDemos\\readingFileDemo\\readingFileDemo\\src\\sayilar.txt")); //bellekten dosya okunması için
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            reader.close(); //dosyayı bulamazsa kapatacak bir şey bulamamz bu sebeple IO exception fırtaılması için
            //Add exception to method signature ile exception eklenir.
        }
    }
}