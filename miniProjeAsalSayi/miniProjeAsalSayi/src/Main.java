
public class Main {
    public static void main(String[] args) {
    int number = 7;
// numeric değerden bi bölümün kalanı elde edilmek isteniyorsa number%bölen operatörü kullanılır

    boolean primeState = true;  //asal olma durumu bir flag ile tanımlanır

    if (number == 1){
            System.out.println(number + " sayısının asal olma durumu: false");
            return; //return ile işlem sonucunu döndürür.
        }

        if (number<1){
            System.out.println("Geçersiz Sayı");
        }
        for (int i=2;i<number;i++){  //number değişkeni kendi değerine gelene kadar bir sayıya bölümü 0 ise flag false'a döner
            if (number%i == 0) {
                primeState = false;
            }else
                primeState = true;
        }
        if (primeState){ //eğer flag true ise
            System.out.println(number + " sayısının asal olma durumu: "+ primeState); //sayı asaldır
        }else //flag false ise
            System.out.println(number + " sayısının asal olma durumu: "+ primeState); //sayı asal değildir.
    }
}