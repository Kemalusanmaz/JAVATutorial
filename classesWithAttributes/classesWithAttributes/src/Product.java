public class Product {
    //class public olduğu için bu classa her yerden ulaşılabilir.

    // bir class aynı zamanda attribute barındırma özelliği vardır.
    // attribute | field
    private int id; // sadce tanımlandığı blokta geççerlidir.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod; //kullanıcının giriş yapmayacağı operasyonlarda encapsulation yapılır.

    public void metot(){
        name = "Kemal"; //private değişken class içinde aktarılabilir.
    }

}
