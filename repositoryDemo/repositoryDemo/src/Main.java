public class Main {
    public static void main(String[] args) {
        //repository deseni veri tabanı işlemleri için kullanılır. ekleme silme güncelme datayı çekme işlemleri çok benzerdir. değişken olan tek şey product customer gibi tablolardır.

        Validator validator = new Validator(); //referans bir validator nesnesi oluşturulur.
        Customer customer = new Customer(); // referans bir customer nesnesi oluşturulur.
        validator.validate(customer);
        //validator nesnenini içinde bulunan validate operasyonu generic olarak ayarlanmıştı
        // T tipinde bir argüman almalı bu tip ise IEntity interfacesinden extend eder.
        // IEntity interfaceini Customer ve Product nesneleri implement ettiği için validate operasyonunun argümanı Customer veya Product nesnesi olmalı.
    }
}