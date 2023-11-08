//JAVA'nın içinde tanımlı paketler vardır => built-in
//projede oluşturulan katmanlar sıklıkla paket haline getirilir.

import matematik.DortIslem;
import matematik.Logaritma;

import matematik.* ;//paketin içindeki classları tek tek import etmek yerine .* şeklinde içindeki tüm classlar çağrılır

import java.util.Scanner; // built-in paket import edilir. scanner konsol üzerinden kullanıcı data alınmasını sağlar.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //paketin içindeki class oluşturulur.

        System.out.println("Adınız: ");

        String isim = scanner.nextLine(); //Konsoldan kullanıcı girişi yapılmalıdır.

        System.out.println("Merhaba " + isim);

        //matematik paketinin içinde oluşturulan Dortıslem classının referansı alınır.
        // Classın içindeki operasyonu gerçekleştirmek için topla fonksiyonu çağrılır.
        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(5,10);
        Logaritma logaritma= new Logaritma();
        logaritma.logaritmaHesapla();

    }
}