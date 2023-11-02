public class Main {
    public static void main(String[] args) {
    String[][] sehirler = new String[3][3]; //3x3'lük matris oluşturur. [satır][sütun]

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        //nefted loop içiçe dögüler
        for (int i = 0; i <= 2; i++){ //önce 0. satırın sütunlarını gezer. Sonra 1. satırın sonra 2. satırın sütunlarını gezer.
            System.out.println("---------------------------------");
            for (int j = 0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}