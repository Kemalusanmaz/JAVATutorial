public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product newProduct = new Product();
        newProduct.price = 5000;
        newProduct.id = 1;
        newProduct.name = "PC";
        productManager.add(newProduct);


        //inner static classlar bu şekilde tanımlanabilir. Önerilmeyen bir yöntemdir.
        //Bir class sadece bir operasyonu yapacak prensibine aykırıdır. O yüzden ayrı ayrı classlar oluşturulması daha iyidir.
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}