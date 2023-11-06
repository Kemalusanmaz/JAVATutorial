import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //reference type

        //classın kullanılabilmesi için new'lenmiş olması gerekir.
        //bellekte iki alan vardır. Stack ve Heap
        //new CustomerManager refereansı oluşturulduğunda Stack alınanda depolanır.
        //heap'te ise CustomerManager nesnesi oluşuyor. Aslında Heap'te tutulan nesneden fonksiyonlar çağrılıyor.

        CustomerManager customerManager = new CustomerManager(); //CustomerManager türünde bir örnek oluşturulur.
        // Oluşturulan bir class bu şekilde çağrılır.
        //Bu nesne customerManager ismini alır.

        CustomerManager customerManager2 = new CustomerManager();

        //customerManager = customerManager2; //bu şekilde eşitleme yapıldığında artık customerManager Stackte customerManager2 olarak tutulur.
        //customerManager'ın Heap'teki referansı garbage'a gidilir bellekten silirnir.

        customerManager.Add(); //CustomerManager classı içinde bulunan fonksiyonlar artık çağrılabilir.
        customerManager.Remove();
        customerManager.Update();

        //value type - değer tipli değişkenler

        //değer tipli bir referans oluştuğunda her şey stack üzerinde oluşur.
        //Stack
        //sayi1 = 10
        //sayi2 = 20
        //sayi2 = sayi1 dendiğinde zaman artık sayi20'nin değeri 20 olan değer eşitliğin sağ tarafındaki değer olur yani 10 olur.
        //sayi1 = 30 dendiğinde artık sayı1'in değeri 10 eşitliğin sağ tarafındaki değer olur yani 30.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //reference type - diziler referans tiptir.
        //Stack              Heap
        //101.sayılar       101. 1,2,3
        //102.sayilar2      102. 4,5,6
        //sayılar2'nin referans nosu = sayılar'ın referans nosu.
        // Yani sayilar2nin referans nosu artık 101 olur ve Heap alanında 101 nolu refeerans değerleri kullanır.
        //102 nolu referans değer artık garbage'tır.
        //101.sayılar       101. 1,2,3
        //101.sayilar2      102. 4,5,6 (garbage)
        //101. referans değerinin heap'teki 0. index değeri 10 yapılır. Bu sebeple sayılar2nin de sayılarında 0. indezi 10'dur.
        int[] sayilar = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar2[0]);


    }
}
