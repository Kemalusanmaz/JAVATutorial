import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>(); // tip güvenli arraylist oluştumak. Çalışılacak tip haricinde tip kullanılmaz.
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Manisa");
        sehirler.add("Aydın");

        sehirler.remove("İstanbul"); //silerken index no veya değişken yazılabilir.

        Collections.sort(sehirler); //arraylistia-z küçük-büyük sıralar

        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}