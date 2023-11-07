public abstract class GameCalculator { //base sınıf
    //base classta oluşturulan fonksiyon diğer classlarda değer değişecekse override edilebilir.
    // Diğer yöntem ise abstract class
    //Base classın önüne abstract yazılır ve artık bu bir abstract class olur.
    //Eğer base'de bulunan fonksiyon abstract yapılırsa diğer inheritance alan classlar bunu ezme zorundadır yani bu fonksiyonu kullanmak zorundadır.
    public abstract void hesapla(); //bu fonksiyon inherit edilen classlarda kullanılması zorunludur.
    /*{
        System.out.println("Puanınız : 100");
    }*/
    //
    public final void gameOver(){ // tamamlanmış operasyon için fianl kullanılır.
        System.out.println("Oyun bitti.");
    }

}
