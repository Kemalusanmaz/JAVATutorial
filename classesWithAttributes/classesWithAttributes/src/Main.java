public class Main {

    public static void main(String[] args) {
    Product product = new Product();
    product.name = "Laptop";
    product.id = 1;
    product.description = "ASUS Laptop";
    product.price = 5000;
    product.stockAmount = 3;

    Product product1 = new Product();
    product1.name = "Laptop";
    product1.id = 1;
    product1.description = "ASUS Laptop";
    product1.price = 5000;
    product1.stockAmount = 3;

    ProductManager productManager = new ProductManager();

        productManager.add(product);
        productManager.add(product1);

    }
}