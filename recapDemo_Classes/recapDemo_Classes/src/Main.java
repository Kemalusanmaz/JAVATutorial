public class Main {

    public static void main(String[] args) {
        DortIslem hesapMakinesi = new DortIslem(); //classın referansı hesapMakinesi adı altında oluşturulur.

        int toplamaIslemi = hesapMakinesi.toplama(1,2);
        System.out.println(toplamaIslemi);

        int cikartmaIslemi = hesapMakinesi.cikartma(1,2);
        System.out.println(cikartmaIslemi);

        int carpmaIslemi = hesapMakinesi.carpma(1,2);
        System.out.println(carpmaIslemi);

        float bolmeIslemi = hesapMakinesi.bolme(1,2);
        System.out.println(bolmeIslemi);
    }
}