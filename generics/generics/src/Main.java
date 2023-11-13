import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      /*  ArrayList sehirler = new ArrayList<>(); //farklı tiplerde çalışılmaya olanak sağladığı için generic bir classtır.
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add(1); //arrayliste farklı bir tür de eklenebilir. Obje olarak çalışır.

        //ArrayList<String> yapılırsa tip sabit olur.*/

        MyList<Customer> sehirler = new MyList<>();
        sehirler.add(new Customer());
        sehirler.add(new Customer());
    }
}