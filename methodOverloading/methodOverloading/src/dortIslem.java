public class dortIslem {

    // --- method overloading ---

    //Aynı isimde iki fonksiyon iki kere tanımlanırsa overloading olur. İki fonksiyonda çalışır.
    // İlk fonskyion iki int değer alırken, ikinci fonksiyon üç int değer alır ve operasyon iki farklı şekilde yapılır.
    //eğer main classın içinde kullanılan topla fonsiyonu iki değişken almışsa ilk fonksiyon, 3 değişken almışsa 2. fonksiyon çalışır.
    public int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }
}
