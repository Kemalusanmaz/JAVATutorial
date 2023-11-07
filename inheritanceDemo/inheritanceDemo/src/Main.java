public class Main {
    public static void main(String[] args) {
        //Gerçek hayatta her işlemin yapılacağı ayrı classlar oluşturulur. Manager, attribute, UI vb...
        // Bu classların ortak attribute veya fonksiyonları bir base classta toplanır.
        //manager classlar base classı extends yaparak içindeki fonksiyonları miras alır. (inheritance).

        //Kullanıcı arayüzü için oluşturulan classda manager classları çağrılır.
        // Oradaki argümanlar buton textbox gibi nesnelerle eşleştirilir.
        //Fakat her yeni classs oluştuurlduğunda UI'ya UI classına eklenmesi gerekir.
        //Bunun yerine Base class UI classı içinde çağrılırsa miras alan classlar çağrılmış olur.

        //Main classında, KrediUI classı base classı içinde bulundurduğu için UI classı üzerinden manager classları çağrılabilir.




        KrediUI krediUI = new KrediUI(); //krediUI classı için bir değişken oluşturulur.
        krediUI.KrediHesapla(new OgretmenKrediManager()); //bu fonk dışarıdan class alır.
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
