//JAVA'nın içinde tanımlı paketler vardır => built-in

import java.util.Scanner; // built-in paket import edilir. scanner konsol üzerinden kullanıcı data alınmasını sağlar.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //paketin içindeki class oluşturulur.

        System.out.println("Adınız: ");

        String isim = scanner.nextLine(); //Konsoldan kullanıcı girişi yapılmalıdır.

        System.out.println("Merhaba " + isim);
    }
}