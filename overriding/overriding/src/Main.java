// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        double krediSonucu = ogretmenKrediManager.hesapla(10000);
        System.out.println(krediSonucu);*/

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

        for (BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(100));
        }

    }
}