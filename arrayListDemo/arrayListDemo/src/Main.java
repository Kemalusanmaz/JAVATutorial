import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//
        //int[] sayilar = new int[]{1,2,3}; //dizi oluşturmak Tanımlanıldığı gibi referans tutulur.
        //sayilar[3] = 4; // yeni elema eklenmeye çalııldığı zaman sınır hatası verilir.
        //sayilar = new int[4]; //new denildiği için sayilar dizisinin yeni bir referanbsı alınmış olur.
        //System.out.println(sayilar[0]); //new int değişkenine bir değer atanmadığı için de ilk eleman 1 değil 0 olur.

        //kolleksiyonlar arkada bir dizi üreti. Yeni bir eleman ejkendiği zaman yeni bir referans oluşturmaz eski elemanları da tutar.

        //---- ArrayList Oluşturma ----
        ArrayList sayilar = new ArrayList(); //Arraylist kulanılması için ArrayList paketinin import edilmesi gerekir.
        // Eleman sayısı tanımlanmasına gerek yoktur.


        //---- ArrayList eleman ekleme ----
        sayilar.add(1); // arrayliste eleman ekelemk için kullanılacak operasyon
        sayilar.add(10);
        sayilar.add("Ankara"); //dizilerden farklı olarak farklı tipte eleman alabilir.

        //---- ArrayList eleman sayısını bulma ----
        System.out.println(sayilar.size()); // arraylistin eleman sayısını verir.


        //---- ArrayList elemanının değerini değiştirme ----
        //sayilar.set(0,100); // set operasyonu ile 1. parametrede yazılan index, 2. parametrede yazılan değer ile değiştirilir.
        //Elemanı olmayan bir indexi set etmeye çalışılırsa hata alınır.

        //---- ArrayList eleman silme ----
        //sayilar.remove(0); //bir index silinirse silinen yere doğru sola doğru kayılır.

        //---- ArrayList tüm elemanları silme ----
        //sayilar.clear(); // arraylistteki tüm elemanları siler.

        //---- ArrayList istenilen elemana ulaşma ----
        System.out.println(sayilar.get(0)); //arraylistteki verilen indexteki elamanı get fonk ile çağrılır.

        //---- ArrayList elemanlarını for döngüsüyle gezme ----
        for (Object sayi:sayilar){// arraylistin elemanlarına ulaşmak için her eleman Object olarak tanımlanmalıdır.
            System.out.println(sayi);

        }

    }
}