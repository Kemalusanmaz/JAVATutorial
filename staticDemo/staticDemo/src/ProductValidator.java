public class ProductValidator { //ana classlar static olarak ayarlanamaz
    //Product Validator => Bir ürünü kaydederken veya güncellerken kurallara uygun olup olmadığını bulmak için kullanılır.

    static { //nesneinin içinde operasyonlar static şekilde oluşturulduysa ve yapıcı blok çalıştırılmak isteniyorsa static şeklinde operasyon ile çalıştırılabilir.
        // new lenmeye gerek yoktur.
        //Birden fazla static operasyon yapılabilir ama çok popüler değildir.
        System.out.println("Static Yapıcı blok çalıştı.");
    }
    public ProductValidator(){ //constructor blok
        System.out.println("Yapıcı blok çalıştı."); //yapıcı bloklar nesne içinde newlendiğinde yani referansı alındığında çalışır.
        //ProductValidator nesnesi içinde bulunan bisey operasyonu static olmadığı için productmanager nesnesi içinde kullaınlırken new lenmişti.
        //Bu sebeple yapıcı blok çalışır.
    }

    public static boolean isValid(Product product){ //return yapan operasyon.
        //Static yapılırsa bu claasın operasyonu ProductValidator.isValid şeklinde kullanılabilir. new ile referans almaya gerek yoktur.
        // ürünün veri tabanına kaydedilebilmesi için fiyat sıfırdan büüyk ve isim boş değilse gerekiyor.
        if (product.price > 0 && !product.name.isEmpty()){
            return true; //eğer doğruysa true döndür
        } else
            return false; //eğer yanlışsa false döndür

    }

    public void bisey(){

    }

    //inner class => gruplandırma amaçlı kullanılır. alt class static olarak ayarlanabilir.
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
