import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//hashmap yapısal anlamda sözlüğe benzer . python - dictionary. key-value.

        //---- hashmap oluşturma ----
        HashMap<String,String> sozluk = new HashMap<String,String>(); //hashmap oluştuurluken key ve value türü collection içine yazılır.

        //---- hashmap eleman ekleme ----
        sozluk.put("book","kitap"); //key value girişi put operasyonu ile yapılır.
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        //---- hashmap eleman sayısı bulma----
        System.out.println(sozluk.size()); //hashmapte kaç eleman varsa onu verir.

        //---- hashmap key silme ----
        //sozluk.remove("table"); //bir key silinirse ve .ağrılırs akarşılığı olmadığı için null değeri döner.

        //---- hashmap tüm keyleri silme ----
        //sozluk.clear();

        System.out.println(sozluk);

        //---- hashmap key bilgisiyle value çağırma ----
        String table = sozluk.get("table"); //get operasyonunada key verilirse value'sine ulaşılır.
        System.out.println(table);

        for (String key:sozluk.keySet()){ //.keySet operaasyonu ile hashmpateki keyleri dolaşır
            System.out.println(key); //sıralı bir yapı değildir java algoritmasına göre sıralama oluşur.
            System.out.println("Eleman:" + key + " " + "Değer:" + sozluk.get(key));
        }

    }
}