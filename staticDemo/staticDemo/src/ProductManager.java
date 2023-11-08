public class ProductManager {

       public static void add(Product product){

        //static olmadığı durumda ProductValidator nesnesinin new ile referansı alınması gerekir.
       /* ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {
            System.out.println("Eklendi.");
        }else
            System.out.println("ürün geçersiz.");*/

        //ProductValidator nesnesinin operasyonu static olduğu durumda operasyonu referans almadan class ismi ile çağrılabilir.
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi.");
        }else
            System.out.println("ürün geçersiz.");

        //operasyon static olarak oluşturulduğunda sadece bir kere referansı alınmış olur.
        //Uygulama durana kadar bellekten atılmaz. Bu kötü bir özellik bu sebeple gerekmedikçe operasyon static yapılmaz.
        //manager sınıfları static yapılmaz daha

        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey(); // eğer operasyon statik değilse nesne nin yine new ile referansı alınmalıdır.

    }
}
