public class Main {
    public static void main(String[] args) {
        //exception uygulamay yönelik hatalardır. Kodlar ile kontrol altında tutulabilir.
        //Error kodlarla müfahale edilemeyecek hatalardır. örn : sanal makinalar.

        try{ //try bloğunun içindeki kotu çalıştırmayı dene
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }//catch (Exception exception){ // kodlarda hata gelirse bu bloğa geçilir.
        catch (ArrayIndexOutOfBoundsException exception){ //çıkan hata tipi de exception tipi olarak yazılabilir.
            // try bloğundaki hata catch bloğuna parametre olarak verilir.

            System.out.println("Array Hata oluştu");

            System.out.println(exception.getMessage());

        }catch (StringIndexOutOfBoundsException exception){ //birden çok catch bloğu kullanılabilir.
            System.out.println("String Hata oluştu");
        }catch (Exception exception){//ilk exception tipleri çalışmazsa yani hata catch bloklarında tanımlanmamışsa Exception tipiyle loglanır.
            System.out.println("Loglandı" + exception);
        }
        finally { //son çalışacak blok. ister try ister catch bloğu çalışsın finally bloğu en sonda her türlü çalışır.
            //veritabanına bağlanırken hata oluştu. veri tabanına bağlantı oluştuurlduktan sonra bağlantı kapatılması gerekir. Burada kullanılabilir.
            System.out.println("Her türlü çalışır");
        }

    }
}