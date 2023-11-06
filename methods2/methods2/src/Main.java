public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.substring(0,2); // 0. indexten 2.indexe kadar değerlei alır.
                                                 // Bu şekilde run edilirse bir değer dönmez.
                                                 // Bu sebeple yeni bir değişken atanmalıdır.
        System.out.println(yeniMesaj); //substring bu şekilde değeri return eder.

        int topla = topla();
        System.out.println(topla);

        String sehirVer = sehirVer();
        System.out.println(sehirVer);

        int sayiTopla = ikiSayiTopla(5,10);
        System.out.println(sayiTopla);

        int toplam = topla2(2,3,4,5,6,7,53); //
        System.out.println(toplam);
    }

    //fonksiynlar kendimizi tekrar etmemek için kullanılır.
    // void fonksiyonlar sadece fonksiyon içinde tanımlanmış işlemi yapmak için kullanılır. Bir return işlemi yoktur.
    // void fonksiyonlar string,int gibi değişkenlere atanamaz.
    public static void ekle(){
      System.out.println("Eklendi.");
    }
    public static void sil(){
        System.out.println("Sildi.");
    }

    public static void guncelle(){
        System.out.println("Güncellendi.");
    }

    public static int topla(){ //void yerine int yazılmıştır. Bu fonksiyon int türünde bir değer döndürür. return kullanılması gerekir.
        return 5; //fonksiyondan 5 int değeri döner
    }
    public static String sehirVer(){
        return "istanbul"; //fonksiyondan istanbul string değeri döner
    }

    public static int ikiSayiTopla(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        return toplam;
    }

    public static int topla2(int... sayilar){ //int... ile fonksiyona limitsiz argüman gönderilebilir. yani bir integer array gibi çalışır.
        int toplam = 0;
        for (int sayi:sayilar){ //sayilar dizisindeki her bir sayi döner
            toplam = toplam + sayi; //listedeki her sayi sırayla toplanır.

        }
        return toplam; //toplam değeri return edilir.
    }
}