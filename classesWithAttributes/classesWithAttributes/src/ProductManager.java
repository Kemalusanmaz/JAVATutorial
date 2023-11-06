public class ProductManager {
    public void add(Product product){ //burada Product classında tanımlanmış attributeler bu fonksiyona argüman olarak gelir.
        //JDBC
        System.out.println("Ürün eklendi." + product.name);
    }

    public void add2(int id, String name, String description, int stockAmount, double price){
        //bu şekilde oluşturulan bir operasyonda yeni bir özellik eklendiğinde mainde tanımlanan fonksiyonun hepsine bu yeni özelliğin eklenmesigerekir.
        //by şekilde kullanılmamalı.

    }
}
