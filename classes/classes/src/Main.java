public class Main {

    public static void main(String[] args) {
        //classın kullanılabilmesi için new'lenmiş olması gerekir.
        //bellekte iki alan vardır. Stack ve Heap
        //new CustomerManager refereansı oluşturulduğunda Stack alınanda depolanır.
        //heap'te ise CustomerManager nesnesi oluşuyor. Aslında Heap'te tutulan nesneden fonksiyonlar çağrılıyor.


        //reference type
        CustomerManager customerManager = new CustomerManager(); //CustomerManager türünde bir örnek oluşturulur.
        // Oluşturulan bir class bu şekilde çağrılır.
        //Bu nesne customerManager ismini alır.

        CustomerManager customerManager2 = new CustomerManager();

        //customerManager = customerManager2; //bu şekilde eşitleme yapıldığında artık customerManager Stackte customerManager2 olarak tutulur.
        //customerManager'ın Heap'teki referansı garbage'a gidilir bellekten silirnir.

        customerManager.Add(); //CustomerManager classı içinde bulunan fonksiyonlar artık çağrılabilir.
        customerManager.Remove();
        customerManager.Update();
    }
}
