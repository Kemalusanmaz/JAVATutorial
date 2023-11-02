public class Main {
    public static void main(String[] args) {
    String mesaj = "Bugün hava çok güzel.";
    System.out.println(mesaj);

    System.out.println("Eleman sayısı: "+mesaj.length()); //stringin kaç chardan oluştuğunu yazni boyutunu verir.
    System.out.println("5. eleman: "+mesaj.charAt(4)); //stringin 4. charını yani elemanını verir.
    System.out.println(mesaj.concat(" Yaşasın!")); //concat ile string ifadenin sonuna string ekleme yapılabilir. Yeni bir değişkene atama yapılır.
    System.out.println(mesaj.startsWith("B")); //eğer b ile başlıyorsa true, başlamıyorsa false döndürür. return boolean
    System.out.println(mesaj.endsWith("."));//eğer . ile sonlanıyorsa true, sonlanmıyorsa false döndürür. return boolean

    char[] karakterler = new char[5];
    mesaj.getChars(0,5,karakterler,0); //void fonksiyon yani return yok. string değişkenin belli bir char aralığını getirir.
        //getChars(başlangıç charı,bitiş charı, nereye atanacak,nereden başlayacak)
    System.out.println(karakterler);

    System.out.println(mesaj.indexOf("a"));//karakterin mesaj içinde kaçıncı indexte olduğu bilgisini verir. İlk bulduğunu verir ve operasyonu bitir.
    System.out.println(mesaj.lastIndexOf("a")); //aramaya sağ taraftan başlar.
    }
}