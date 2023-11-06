public class Main {

    public static void main(String[] args) {

    //---- Constraction Blok - Yapıcı Bloklar ----
    //yapıcı blok içinde tanımlanmış operasyonu çalıştırır. Defaultta bir şey yoktur.

    //yapıcı blok içinde attributler tanımlanır.
    Product product = new Product(1,"Laptop","ASUS Laptop",5000,3,"siyah");
    System.out.println(product.getKod());

    //---- Encapsulation---

    /*Product product = new Product();
    product.setName("Laptop");
    product.setId(1); //encapsulation yapılıyor. id set ediliyor.
    product.setDescription("ASUS Laptop");
    product.setPrice(5000);
    product.setStockAmount(3);*/

    //----- public değişkenler ile classı kullanmak ----

    /*Product product = new Product();
    product.name = "Laptop"; //class içindeki değişlenler private olrak yapıldığı için başka bir class bunu kullanamıyor.
    product.description = "ASUS Laptop";
    product.id = 1;
    product.price = 5000;
    product.stockAmount = 3;
     */
    ProductManager productManager = new ProductManager();

    productManager.add(product);

    //productManager.add2(1,"","",2,200); yeni özellik classta eklenip fonksyon argümanı olarak tanımlanmadığı için hata verir. Dinamik değildir.


    }
}