public class ProductManager {
    public void add(Product product){ //burada Product classında tanımlanmış attributeler bu fonksiyona argüman olarak gelir.
        //JDBC
        System.out.println("Ürün eklendi." + product.name);

    }
}
