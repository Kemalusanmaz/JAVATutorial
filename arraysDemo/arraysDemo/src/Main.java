
public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------------------------------------------------------------------");

        String[] ogrenciler =  new String[4];
        //dizi oluşturmak isteniliyorsa değişkenTipi[] şeklinde yapılır.
        // Eşitliğin çıkış tarafına kaç elemandan oluşacağı bilgisi verilir.

        ogrenciler[0] = "Engin"; //0. index = 1. eleman
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        //ogrenciler[4] = "Ali";  array tanımlanırken eleman sayısı 4 verildiği için diziye bu değişken eklendiğinde exception fırlatır.

        for (int i=0; i<ogrenciler.length; i++){  //for döngüsüyle ogrenciler[] dizisinin elemanlarında gezilir.
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------------------------------------------------------------");

        for (String ogrenci:ogrenciler){ //dizideki her bir elemanı gez. her iterasyondaki elemana ogrenci degiskenini ata.
            System.out.println(ogrenci);
        }
    }
}