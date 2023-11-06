public class Main {

    public static void main(String[] args) {
    Product product = new Product();
    //product.name = "Laptop"; //class içindeki değişlenler private olrak yapıldığı için başka bir class bunu kullanamıyor.
    product.setName("Laptop");
    //product.id = 1;
    product.setId(1); //encapsulation yapılıyor. id set ediliyor.
    //product.description = "ASUS Laptop";
    product.setDescription("ASUS Laptop");
    //product.price = 5000;
    product.setPrice(5000);
    //product.stockAmount = 3;
    product.setStockAmount(3);


    ProductManager productManager = new ProductManager();

    productManager.add(product);

    //productManager.add2(1,"","",2,200); yeni özellik classta eklenip fonksyon argümanı olarak tanımlanmadığı için hata verir. Dinamik değildir.

    System.out.println(product.getKod());

    }
}