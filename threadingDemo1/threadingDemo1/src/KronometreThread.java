//thread olarak kullanılabilmesi için Runnable nesnesi implement edilmelidir.
public class KronometreThread implements Runnable{ //threadin yönetildiği nesne

    private Thread thread; //dışardan erişimi engellenmiş Thread tipinde bir değişken.
    private String threadName; //threadlerin birbirinden ayrılması için thread ismi verilmelidir.

    public KronometreThread(String threadName){ //yapıcı blok ile değişkenler argüman olarak verilir. Nesne bu değişkenler ile ayrışmış olacak.
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: " + threadName);
    }
    @Override
    public void run() { //run metodu threadin kednsiidir. Çalıştırılacak kod yazılmalıdır.
        System.out.println("Çalıştırılıyor: " + threadName);

        try{
            for (int i=1;i<=10;i++){
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000); // milisaniye mertebesinde beklemeyi sağlar
            }
        }catch (InterruptedException exception){
            System.out.println("Thread kesildi: " + threadName);
        }finally {
            System.out.println("Thread sonlandı: " + threadName);
        }

    }

    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if (thread == null){
            thread = new Thread(this,threadName); //eğer thread yoksa oluştur.
            thread.start();
        }
    }

}
