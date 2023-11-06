public class Product {
    //class public olduğu için bu classa her yerden ulaşılabilir.

    // bir class aynı zamanda attribute barındırma özelliği vardır.
    // attribute | field
    private int id; // sadece tanımlandığı blokta geççerlidir. // get ve set edilirken karışmamsı için değişkenler _eklenir.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod; //kullanıcının giriş yapmayacağı operasyonlarda encapsulation yapılır.

    //getter ve setter ile private değişkenlere başka classların ulaşması

    //getter
    public int getId() { //bu şekilde başka classlar id değişkenini okuyabilir. (read-only)
        return id;
    }
    //setter
    public void setId(int id) {// set edilen değer parametre olarak verilmeli.
        this.id = id; //this => içinde bulunulan class
        //this._id=id; bu şekilde de classta bulunan _id çağrılabilir.

    }
    // enkapsüle edilmek istenilen değişken ismine sağ tıklanır.
    // refactor menüsünden Encapsulate Field alanından enkapsüle edilir.
    // Getter ve Setter lar otomatik yazılır.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }



}


