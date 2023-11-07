public class KrediUI { //burada kullanıcı arayüzü tasarlanır. TraımKrediManager ve OgretmenKrediManager class içindeki bilgiler çağrılır.
    public void KrediHesapla(BaseKrediManager baseKrediManager){ //KrediHesapla fonk dışarıdan class alır.
        baseKrediManager.hesapla(); // bu fonkta hesapla fonk çalışır.
    }
}
