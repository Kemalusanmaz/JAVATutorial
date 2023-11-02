public class Main {
    public static void main(String[] args) {
      int sayi = 15;

      if (sayi < 10) {
          System.out.println("Sayı 10'den küçüktür.");
      } else if (sayi > 15) {
          System.out.println("Sayı 15'ten büyüktür.");
      } else if (sayi == 15) {
          System.out.println("Sayı 15'e eşittir.");
      } else  {
          System.out.println("Sayı : " + sayi );
      }
    }
}